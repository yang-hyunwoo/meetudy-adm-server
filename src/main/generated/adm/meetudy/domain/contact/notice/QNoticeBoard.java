package adm.meetudy.domain.contact.notice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeBoard is a Querydsl query type for NoticeBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeBoard extends EntityPathBase<NoticeBoard> {

    private static final long serialVersionUID = -1536923807L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeBoard noticeBoard = new QNoticeBoard("noticeBoard");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final adm.meetudy.domain.member.QMember member;

    public final EnumPath<adm.meetudy.constant.contact.faq.NoticeType> noticeType = createEnum("noticeType", adm.meetudy.constant.contact.faq.NoticeType.class);

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath summary = createString("summary");

    public final adm.meetudy.domain.common.file.QFiles thumbnailFile;

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public final BooleanPath visible = createBoolean("visible");

    public QNoticeBoard(String variable) {
        this(NoticeBoard.class, forVariable(variable), INITS);
    }

    public QNoticeBoard(Path<? extends NoticeBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeBoard(PathMetadata metadata, PathInits inits) {
        this(NoticeBoard.class, metadata, inits);
    }

    public QNoticeBoard(Class<? extends NoticeBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
        this.thumbnailFile = inits.isInitialized("thumbnailFile") ? new adm.meetudy.domain.common.file.QFiles(forProperty("thumbnailFile"), inits.get("thumbnailFile")) : null;
    }

}

