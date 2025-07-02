package adm.meetudy.domain.common.file;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFiles is a Querydsl query type for Files
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFiles extends EntityPathBase<Files> {

    private static final long serialVersionUID = -1782310195L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFiles files = new QFiles("files");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final ListPath<FilesDetails, QFilesDetails> filesDetails = this.<FilesDetails, QFilesDetails>createList("filesDetails", FilesDetails.class, QFilesDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final adm.meetudy.domain.member.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QFiles(String variable) {
        this(Files.class, forVariable(variable), INITS);
    }

    public QFiles(Path<? extends Files> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFiles(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFiles(PathMetadata metadata, PathInits inits) {
        this(Files.class, metadata, inits);
    }

    public QFiles(Class<? extends Files> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
    }

}

