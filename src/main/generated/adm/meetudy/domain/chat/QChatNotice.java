package adm.meetudy.domain.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatNotice is a Querydsl query type for ChatNotice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatNotice extends EntityPathBase<ChatNotice> {

    private static final long serialVersionUID = 421136779L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatNotice chatNotice = new QChatNotice("chatNotice");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final adm.meetudy.domain.member.QMember member;

    public final StringPath message = createString("message");

    public final NumberPath<Long> studyGroupId = createNumber("studyGroupId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QChatNotice(String variable) {
        this(ChatNotice.class, forVariable(variable), INITS);
    }

    public QChatNotice(Path<? extends ChatNotice> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatNotice(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatNotice(PathMetadata metadata, PathInits inits) {
        this(ChatNotice.class, metadata, inits);
    }

    public QChatNotice(Class<? extends ChatNotice> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
    }

}

