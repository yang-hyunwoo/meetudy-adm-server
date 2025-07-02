package adm.meetudy.domain.contact.qna;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQnaBoard is a Querydsl query type for QnaBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQnaBoard extends EntityPathBase<QnaBoard> {

    private static final long serialVersionUID = -849358411L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQnaBoard qnaBoard = new QQnaBoard("qnaBoard");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    public final StringPath answer = createString("answer");

    public final DateTimePath<java.time.LocalDateTime> answerAt = createDateTime("answerAt", java.time.LocalDateTime.class);

    public final adm.meetudy.domain.member.QMember answerUserId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<adm.meetudy.constant.contact.faq.FaqType> qnaType = createEnum("qnaType", adm.meetudy.constant.contact.faq.FaqType.class);

    public final StringPath questionContent = createString("questionContent");

    public final StringPath questionTitle = createString("questionTitle");

    public final adm.meetudy.domain.member.QMember questionUserId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QQnaBoard(String variable) {
        this(QnaBoard.class, forVariable(variable), INITS);
    }

    public QQnaBoard(Path<? extends QnaBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQnaBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQnaBoard(PathMetadata metadata, PathInits inits) {
        this(QnaBoard.class, metadata, inits);
    }

    public QQnaBoard(Class<? extends QnaBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.answerUserId = inits.isInitialized("answerUserId") ? new adm.meetudy.domain.member.QMember(forProperty("answerUserId")) : null;
        this.questionUserId = inits.isInitialized("questionUserId") ? new adm.meetudy.domain.member.QMember(forProperty("questionUserId")) : null;
    }

}

