package adm.meetudy.domain.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatLink is a Querydsl query type for ChatLink
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatLink extends EntityPathBase<ChatLink> {

    private static final long serialVersionUID = 1519924077L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatLink chatLink = new QChatLink("chatLink");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath linkUrl = createString("linkUrl");

    public final adm.meetudy.domain.member.QMember member;

    public final NumberPath<Long> studyGroupId = createNumber("studyGroupId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QChatLink(String variable) {
        this(ChatLink.class, forVariable(variable), INITS);
    }

    public QChatLink(Path<? extends ChatLink> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatLink(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatLink(PathMetadata metadata, PathInits inits) {
        this(ChatLink.class, metadata, inits);
    }

    public QChatLink(Class<? extends ChatLink> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
    }

}

