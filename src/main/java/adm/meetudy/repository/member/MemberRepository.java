package adm.meetudy.repository.member;

import adm.meetudy.constant.member.MemberProviderTypeEnum;
import adm.meetudy.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    /**
     * 멤버 이메일로 조회
     * @param email 멤버 이메일
     * @return 멤버 객체
     */
    Optional<Member> findByEmail(String email);

    /**
     * 멤버 id,삭제 여부로 조회
     * @param id 멤버 id
     * @param deleted 삭제 여부
     * @return 멤버 객체
     */
    Optional<Member> findByIdAndDeleted(Long id,
                                        boolean deleted);

    /**
     * 멤버 이메일,타입으로 조회
     * @param email 멤버 이메일
     * @param providerType 멤버 타입
     * @return 멤버 객체
     */
    Optional<Member> findByEmailAndProvider(String email,
                                            MemberProviderTypeEnum providerType);


}
