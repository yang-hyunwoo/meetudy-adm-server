package adm.meetudy.domain.common.file;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFilesDetails is a Querydsl query type for FilesDetails
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFilesDetails extends EntityPathBase<FilesDetails> {

    private static final long serialVersionUID = -206758219L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFilesDetails filesDetails = new QFilesDetails("filesDetails");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    public final StringPath changeFileName = createString("changeFileName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final QFiles files;

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final StringPath fileType = createString("fileType");

    public final StringPath fileUrl = createString("fileUrl");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath originFileName = createString("originFileName");

    public final StringPath publicId = createString("publicId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QFilesDetails(String variable) {
        this(FilesDetails.class, forVariable(variable), INITS);
    }

    public QFilesDetails(Path<? extends FilesDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFilesDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFilesDetails(PathMetadata metadata, PathInits inits) {
        this(FilesDetails.class, metadata, inits);
    }

    public QFilesDetails(Class<? extends FilesDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.files = inits.isInitialized("files") ? new QFiles(forProperty("files"), inits.get("files")) : null;
    }

}

