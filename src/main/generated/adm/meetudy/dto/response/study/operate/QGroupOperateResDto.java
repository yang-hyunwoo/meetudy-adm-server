package adm.meetudy.dto.response.study.operate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.study.operate.QGroupOperateResDto is a Querydsl Projection type for GroupOperateResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGroupOperateResDto extends ConstructorExpression<GroupOperateResDto> {

    private static final long serialVersionUID = -137469054L;

    public QGroupOperateResDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> thumbnailFileUrl, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> summary, com.querydsl.core.types.Expression<adm.meetudy.constant.study.RegionEnum> regionEnum, com.querydsl.core.types.Expression<Integer> currentMemberCount, com.querydsl.core.types.Expression<Integer> maxMemberCount, com.querydsl.core.types.Expression<String> status, com.querydsl.core.types.Expression<java.time.LocalDate> endDate, com.querydsl.core.types.Expression<java.time.LocalTime> meetingEndTime) {
        super(GroupOperateResDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, adm.meetudy.constant.study.RegionEnum.class, int.class, int.class, String.class, java.time.LocalDate.class, java.time.LocalTime.class}, id, thumbnailFileUrl, title, summary, regionEnum, currentMemberCount, maxMemberCount, status, endDate, meetingEndTime);
    }

}

