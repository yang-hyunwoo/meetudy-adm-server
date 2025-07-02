package adm.meetudy.dto.response.study.join;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.study.join.QGroupScheduleMonthResDto is a Querydsl Projection type for GroupScheduleMonthResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGroupScheduleMonthResDto extends ConstructorExpression<GroupScheduleMonthResDto> {

    private static final long serialVersionUID = 1316605017L;

    public QGroupScheduleMonthResDto(com.querydsl.core.types.Expression<Long> groupId, com.querydsl.core.types.Expression<String> groupName, com.querydsl.core.types.Expression<java.time.LocalDate> meetingDate, com.querydsl.core.types.Expression<java.time.LocalTime> startTime, com.querydsl.core.types.Expression<java.time.LocalTime> endTime) {
        super(GroupScheduleMonthResDto.class, new Class<?>[]{long.class, String.class, java.time.LocalDate.class, java.time.LocalTime.class, java.time.LocalTime.class}, groupId, groupName, meetingDate, startTime, endTime);
    }

}

