package adm.meetudy.domain.study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyGroupSchedule is a Querydsl query type for StudyGroupSchedule
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyGroupSchedule extends EntityPathBase<StudyGroupSchedule> {

    private static final long serialVersionUID = 1194465325L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyGroupSchedule studyGroupSchedule = new QStudyGroupSchedule("studyGroupSchedule");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> meetingDate = createDate("meetingDate", java.time.LocalDate.class);

    public final TimePath<java.time.LocalTime> meetingEndTime = createTime("meetingEndTime", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> meetingStartTime = createTime("meetingStartTime", java.time.LocalTime.class);

    public final QStudyGroup studyGroup;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QStudyGroupSchedule(String variable) {
        this(StudyGroupSchedule.class, forVariable(variable), INITS);
    }

    public QStudyGroupSchedule(Path<? extends StudyGroupSchedule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyGroupSchedule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyGroupSchedule(PathMetadata metadata, PathInits inits) {
        this(StudyGroupSchedule.class, metadata, inits);
    }

    public QStudyGroupSchedule(Class<? extends StudyGroupSchedule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.studyGroup = inits.isInitialized("studyGroup") ? new QStudyGroup(forProperty("studyGroup"), inits.get("studyGroup")) : null;
    }

}

