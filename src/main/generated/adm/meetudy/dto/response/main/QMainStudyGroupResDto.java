package adm.meetudy.dto.response.main;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.main.QMainStudyGroupResDto is a Querydsl Projection type for MainStudyGroupResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMainStudyGroupResDto extends ConstructorExpression<MainStudyGroupResDto> {

    private static final long serialVersionUID = 974874356L;

    public QMainStudyGroupResDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> thumbnailFileUrl, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> summary, com.querydsl.core.types.Expression<adm.meetudy.constant.study.RegionEnum> regionEnum, com.querydsl.core.types.Expression<String> tag) {
        super(MainStudyGroupResDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, adm.meetudy.constant.study.RegionEnum.class, String.class}, id, thumbnailFileUrl, title, summary, regionEnum, tag);
    }

}

