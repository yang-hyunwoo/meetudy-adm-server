package adm.meetudy.dto.request.study.group;

import adm.meetudy.constant.study.JoinStatusEnum;
import adm.meetudy.constant.study.MemberRole;
import adm.meetudy.domain.member.Member;
import adm.meetudy.domain.study.StudyGroup;
import adm.meetudy.domain.study.StudyGroupMember;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudyGroupJoinReqDto {

    @Schema(description = "스터디 그룹 ID", example = "1")
    private Long studyGroupId;


    public StudyGroupMember toEntity(
            Member member,
            StudyGroup studyGroup
    ) {
        studyGroup.memberCountIncrease();
        return StudyGroupMember.createStudyGroupMember(
                studyGroup,
                member,
                studyGroup.isJoinType() ? JoinStatusEnum.PENDING : JoinStatusEnum.APPROVED,
                MemberRole.MEMBER,
                LocalDateTime.now(),
                studyGroup.isJoinType() ? null : LocalDateTime.now(),
                null,
                null
        );
    }

}
