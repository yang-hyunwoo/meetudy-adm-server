package adm.meetudy.dto.response.study.group;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.study.group.QStudyGroupDetailResDto is a Querydsl Projection type for StudyGroupDetailResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QStudyGroupDetailResDto extends ConstructorExpression<StudyGroupDetailResDto> {

    private static final long serialVersionUID = -1477280567L;

    public QStudyGroupDetailResDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> thumbnailFileUrl, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<adm.meetudy.constant.study.RegionEnum> regionEnum, com.querydsl.core.types.Expression<Boolean> joinType, com.querydsl.core.types.Expression<Integer> currentMemberCount, com.querydsl.core.types.Expression<Integer> maxMemberCount, com.querydsl.core.types.Expression<Boolean> secret, com.querydsl.core.types.Expression<String> tag, com.querydsl.core.types.Expression<Boolean> allowComment, com.querydsl.core.types.Expression<java.time.LocalDate> startDate, com.querydsl.core.types.Expression<java.time.LocalDate> endDate, com.querydsl.core.types.Expression<java.time.LocalTime> meetingStartTime, com.querydsl.core.types.Expression<java.time.LocalTime> meetingEndTime, com.querydsl.core.types.Expression<String> meetingFrequency, com.querydsl.core.types.Expression<String> meetingDay) {
        super(StudyGroupDetailResDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, adm.meetudy.constant.study.RegionEnum.class, boolean.class, int.class, int.class, boolean.class, String.class, boolean.class, java.time.LocalDate.class, java.time.LocalDate.class, java.time.LocalTime.class, java.time.LocalTime.class, String.class, String.class}, id, thumbnailFileUrl, title, content, regionEnum, joinType, currentMemberCount, maxMemberCount, secret, tag, allowComment, startDate, endDate, meetingStartTime, meetingEndTime, meetingFrequency, meetingDay);
    }

}

