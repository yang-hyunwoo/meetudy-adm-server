package adm.meetudy.dto.response.study.join;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.study.join.QGroupScheduleDayResDto is a Querydsl Projection type for GroupScheduleDayResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGroupScheduleDayResDto extends ConstructorExpression<GroupScheduleDayResDto> {

    private static final long serialVersionUID = -2114500875L;

    public QGroupScheduleDayResDto(com.querydsl.core.types.Expression<Long> groupId, com.querydsl.core.types.Expression<String> groupName, com.querydsl.core.types.Expression<java.time.LocalDate> meetingDate, com.querydsl.core.types.Expression<java.time.LocalTime> startTime, com.querydsl.core.types.Expression<java.time.LocalTime> endTime, com.querydsl.core.types.Expression<String> groupImageUrl, com.querydsl.core.types.Expression<adm.meetudy.constant.study.AttendanceEnum> attended) {
        super(GroupScheduleDayResDto.class, new Class<?>[]{long.class, String.class, java.time.LocalDate.class, java.time.LocalTime.class, java.time.LocalTime.class, String.class, adm.meetudy.constant.study.AttendanceEnum.class}, groupId, groupName, meetingDate, startTime, endTime, groupImageUrl, attended);
    }

}

