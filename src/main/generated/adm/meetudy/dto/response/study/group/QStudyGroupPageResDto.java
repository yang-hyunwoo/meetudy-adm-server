package adm.meetudy.dto.response.study.group;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.study.group.QStudyGroupPageResDto is a Querydsl Projection type for StudyGroupPageResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QStudyGroupPageResDto extends ConstructorExpression<StudyGroupPageResDto> {

    private static final long serialVersionUID = 111889095L;

    public QStudyGroupPageResDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> thumbnailFileUrl, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> summary, com.querydsl.core.types.Expression<adm.meetudy.constant.study.RegionEnum> regionEnum, com.querydsl.core.types.Expression<Boolean> joinType, com.querydsl.core.types.Expression<Integer> currentMemberCount, com.querydsl.core.types.Expression<Integer> maxMemberCount, com.querydsl.core.types.Expression<Boolean> secret, com.querydsl.core.types.Expression<String> tag, com.querydsl.core.types.Expression<java.time.LocalDate> startDate, com.querydsl.core.types.Expression<java.time.LocalDate> endDate, com.querydsl.core.types.Expression<java.time.LocalTime> meetingStartTime, com.querydsl.core.types.Expression<java.time.LocalTime> meetingEndTime, com.querydsl.core.types.Expression<String> meetingFrequency, com.querydsl.core.types.Expression<String> meetingDay) {
        super(StudyGroupPageResDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, adm.meetudy.constant.study.RegionEnum.class, boolean.class, int.class, int.class, boolean.class, String.class, java.time.LocalDate.class, java.time.LocalDate.class, java.time.LocalTime.class, java.time.LocalTime.class, String.class, String.class}, id, thumbnailFileUrl, title, summary, regionEnum, joinType, currentMemberCount, maxMemberCount, secret, tag, startDate, endDate, meetingStartTime, meetingEndTime, meetingFrequency, meetingDay);
    }

}

