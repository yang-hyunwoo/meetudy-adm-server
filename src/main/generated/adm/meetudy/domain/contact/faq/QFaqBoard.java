package adm.meetudy.domain.contact.faq;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFaqBoard is a Querydsl query type for FaqBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaqBoard extends EntityPathBase<FaqBoard> {

    private static final long serialVersionUID = 581390033L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFaqBoard faqBoard = new QFaqBoard("faqBoard");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    public final StringPath answer = createString("answer");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final EnumPath<adm.meetudy.constant.contact.faq.FaqType> faqType = createEnum("faqType", adm.meetudy.constant.contact.faq.FaqType.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final adm.meetudy.domain.member.QMember member;

    public final StringPath question = createString("question");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public final BooleanPath visible = createBoolean("visible");

    public QFaqBoard(String variable) {
        this(FaqBoard.class, forVariable(variable), INITS);
    }

    public QFaqBoard(Path<? extends FaqBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFaqBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFaqBoard(PathMetadata metadata, PathInits inits) {
        this(FaqBoard.class, metadata, inits);
    }

    public QFaqBoard(Class<? extends FaqBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
    }

}

