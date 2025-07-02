package adm.meetudy.dto.response.study.operate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.study.operate.QStudyGroupUpdateDetailResDto is a Querydsl Projection type for StudyGroupUpdateDetailResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QStudyGroupUpdateDetailResDto extends ConstructorExpression<StudyGroupUpdateDetailResDto> {

    private static final long serialVersionUID = -811094131L;

    public QStudyGroupUpdateDetailResDto(com.querydsl.core.types.Expression<Long> studyGroupId, com.querydsl.core.types.Expression<Long> studyGroupDetailId, com.querydsl.core.types.Expression<String> thumbnailFileUrl, com.querydsl.core.types.Expression<Long> fileId, com.querydsl.core.types.Expression<Long> fileDetailId, com.querydsl.core.types.Expression<String> originFileName, com.querydsl.core.types.Expression<adm.meetudy.constant.study.RegionEnum> region, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> summary, com.querydsl.core.types.Expression<String> tag, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<java.time.LocalDate> startDate, com.querydsl.core.types.Expression<java.time.LocalDate> endDate, com.querydsl.core.types.Expression<Integer> maxMemberCount, com.querydsl.core.types.Expression<Integer> currentMemberCount, com.querydsl.core.types.Expression<String> meetingFrequency, com.querydsl.core.types.Expression<String> meetingDay, com.querydsl.core.types.Expression<java.time.LocalTime> meetingStartTime, com.querydsl.core.types.Expression<java.time.LocalTime> meetingEndTime, com.querydsl.core.types.Expression<Boolean> joinType, com.querydsl.core.types.Expression<Boolean> secret, com.querydsl.core.types.Expression<String> secretPassword, com.querydsl.core.types.Expression<Boolean> allowComment) {
        super(StudyGroupUpdateDetailResDto.class, new Class<?>[]{long.class, long.class, String.class, long.class, long.class, String.class, adm.meetudy.constant.study.RegionEnum.class, String.class, String.class, String.class, String.class, java.time.LocalDate.class, java.time.LocalDate.class, int.class, int.class, String.class, String.class, java.time.LocalTime.class, java.time.LocalTime.class, boolean.class, boolean.class, String.class, boolean.class}, studyGroupId, studyGroupDetailId, thumbnailFileUrl, fileId, fileDetailId, originFileName, region, title, summary, tag, content, startDate, endDate, maxMemberCount, currentMemberCount, meetingFrequency, meetingDay, meetingStartTime, meetingEndTime, joinType, secret, secretPassword, allowComment);
    }

}

