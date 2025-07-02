package adm.meetudy.domain.study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyGroup is a Querydsl query type for StudyGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyGroup extends EntityPathBase<StudyGroup> {

    private static final long serialVersionUID = 441251702L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyGroup studyGroup = new QStudyGroup("studyGroup");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final NumberPath<Integer> currentMemberCount = createNumber("currentMemberCount", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath joinType = createBoolean("joinType");

    public final NumberPath<Integer> maxMemberCount = createNumber("maxMemberCount", Integer.class);

    public final EnumPath<adm.meetudy.constant.study.RegionEnum> region = createEnum("region", adm.meetudy.constant.study.RegionEnum.class);

    public final StringPath status = createString("status");

    public final QStudyGroupDetail studyGroupDetail;

    public final StringPath summary = createString("summary");

    public final adm.meetudy.domain.common.file.QFiles thumbnailFile;

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QStudyGroup(String variable) {
        this(StudyGroup.class, forVariable(variable), INITS);
    }

    public QStudyGroup(Path<? extends StudyGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyGroup(PathMetadata metadata, PathInits inits) {
        this(StudyGroup.class, metadata, inits);
    }

    public QStudyGroup(Class<? extends StudyGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.studyGroupDetail = inits.isInitialized("studyGroupDetail") ? new QStudyGroupDetail(forProperty("studyGroupDetail"), inits.get("studyGroupDetail")) : null;
        this.thumbnailFile = inits.isInitialized("thumbnailFile") ? new adm.meetudy.domain.common.file.QFiles(forProperty("thumbnailFile"), inits.get("thumbnailFile")) : null;
    }

}

