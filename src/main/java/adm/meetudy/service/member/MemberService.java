package adm.meetudy.service.member;

import adm.meetudy.constant.error.ErrorEnum;
import adm.meetudy.constant.member.MemberProviderTypeEnum;
import adm.meetudy.domain.member.Member;
import adm.meetudy.dto.member.MemberDto;
import adm.meetudy.dto.request.member.JoinMemberReqDto;
import adm.meetudy.dto.response.member.JoinMemberResDto;
import adm.meetudy.exception.CustomApiException;
import adm.meetudy.repository.member.MemberRepository;
import adm.meetudy.service.common.RecaptchaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static adm.meetudy.constant.error.ErrorEnum.*;

import static adm.meetudy.constant.join.JoinErrorCode.*;
import static adm.meetudy.constant.login.LoginErrorCode.*;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final PasswordEncoder passwordEncoder;

    private final MemberRepository memberRepository;

    private final RecaptchaService recaptchaService;

    /**
     * 회원가입
     * @param joinReqDto
     * @return
     */
    public JoinMemberResDto join(JoinMemberReqDto joinReqDto) {
        if (!recaptchaService.verify(joinReqDto.getRecaptchaToken())) {
            throw new CustomApiException(HttpStatus.BAD_GATEWAY, ErrorEnum.ERR_001,"reCAPTCHA 검증 실패");
        }
        //1. 동일 유저네임 존재 검사
        memberRepository.findByEmailAndProvider(joinReqDto.getEmail(), MemberProviderTypeEnum.NORMAL).ifPresent(user -> {
            throw new CustomApiException(JI_DUPLICATION_EMAIL.getStatus(), ERR_003,JI_DUPLICATION_EMAIL.getMessage());
        });

        Member save = memberRepository.save(joinReqDto.toEntity(passwordEncoder));
        return JoinMemberResDto.from(MemberDto.from(save));
    }

    /**
     * 비밀번호 오류 횟수 증가
     * @param email
     */
    public void memberLgnFailCnt(String email) {
       memberRepository.findByEmail(email)
                .orElseThrow(() -> new CustomApiException(LG_MEMBER_ID_PW_INVALID.getStatus(), ERR_007,LG_MEMBER_ID_PW_INVALID.getMessage()))
                .increaseFailLoginCount();
    }

    /**
     * 비밀번호 오류 횟수 초기화
     * @param id
     */
    public void memberLgnFailInit(Long id) {
     memberRepository.findById(id)
             .orElseThrow(() -> new CustomApiException(LG_MEMBER_ID_PW_INVALID.getStatus(), ERR_007, LG_MEMBER_ID_PW_INVALID.getMessage()))
             .initLoginCount();
    }

}
