package adm.meetudy.dto.response.main;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * adm.meetudy.dto.response.main.QMainNoticeResDto is a Querydsl Projection type for MainNoticeResDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMainNoticeResDto extends ConstructorExpression<MainNoticeResDto> {

    private static final long serialVersionUID = -751229546L;

    public QMainNoticeResDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<adm.meetudy.constant.contact.faq.NoticeType> noticeType, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> summary, com.querydsl.core.types.Expression<String> thumbnailFileUrl) {
        super(MainNoticeResDto.class, new Class<?>[]{long.class, adm.meetudy.constant.contact.faq.NoticeType.class, String.class, String.class, String.class}, id, noticeType, title, summary, thumbnailFileUrl);
    }

}

