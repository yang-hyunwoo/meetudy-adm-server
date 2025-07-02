package adm.meetudy.dto.request.study.group;

import adm.meetudy.annotation.ValidationMode;
import adm.meetudy.constant.error.ValidationType;
import adm.meetudy.domain.member.Member;
import adm.meetudy.domain.study.Attendance;
import adm.meetudy.domain.study.StudyGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ValidationMode(ValidationType.SINGLE)  // SINGLE 단일 / ALL 다중 에러 리턴
@AllArgsConstructor
@Builder
public class StudyGroupAttendanceReqDto {

    @Schema(description = "스터디 그룹 ID PK", example = "1")
    private Long studyGroupId;

    public Attendance toEntity(StudyGroup studyGroup,
                               Member member,
                               LocalDateTime meetingStartDateTime
    ) {
        return Attendance.createAttendance(
                studyGroup,
                member,
                LocalDate.now(),
                LocalDateTime.now(),
                meetingStartDateTime
        );
    }

}
