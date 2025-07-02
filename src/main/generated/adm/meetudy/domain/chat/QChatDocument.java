package adm.meetudy.domain.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatDocument is a Querydsl query type for ChatDocument
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatDocument extends EntityPathBase<ChatDocument> {

    private static final long serialVersionUID = 261972750L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatDocument chatDocument = new QChatDocument("chatDocument");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final adm.meetudy.domain.common.file.QFiles files;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final adm.meetudy.domain.member.QMember member;

    public final NumberPath<Long> studyGroupId = createNumber("studyGroupId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QChatDocument(String variable) {
        this(ChatDocument.class, forVariable(variable), INITS);
    }

    public QChatDocument(Path<? extends ChatDocument> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatDocument(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatDocument(PathMetadata metadata, PathInits inits) {
        this(ChatDocument.class, metadata, inits);
    }

    public QChatDocument(Class<? extends ChatDocument> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.files = inits.isInitialized("files") ? new adm.meetudy.domain.common.file.QFiles(forProperty("files"), inits.get("files")) : null;
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
    }

}

