package adm.meetudy.domain.study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyGroupDetail is a Querydsl query type for StudyGroupDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyGroupDetail extends EntityPathBase<StudyGroupDetail> {

    private static final long serialVersionUID = 811993959L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyGroupDetail studyGroupDetail = new QStudyGroupDetail("studyGroupDetail");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    public final BooleanPath allowComment = createBoolean("allowComment");

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final BooleanPath deleted = createBoolean("deleted");

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath latePay = createBoolean("latePay");

    public final StringPath meetingDay = createString("meetingDay");

    public final TimePath<java.time.LocalTime> meetingEndTime = createTime("meetingEndTime", java.time.LocalTime.class);

    public final StringPath meetingFrequency = createString("meetingFrequency");

    public final TimePath<java.time.LocalTime> meetingStartTime = createTime("meetingStartTime", java.time.LocalTime.class);

    public final BooleanPath secret = createBoolean("secret");

    public final StringPath secretPassword = createString("secretPassword");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final QStudyGroup studyGroup;

    public final StringPath tag = createString("tag");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QStudyGroupDetail(String variable) {
        this(StudyGroupDetail.class, forVariable(variable), INITS);
    }

    public QStudyGroupDetail(Path<? extends StudyGroupDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyGroupDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyGroupDetail(PathMetadata metadata, PathInits inits) {
        this(StudyGroupDetail.class, metadata, inits);
    }

    public QStudyGroupDetail(Class<? extends StudyGroupDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.studyGroup = inits.isInitialized("studyGroup") ? new QStudyGroup(forProperty("studyGroup"), inits.get("studyGroup")) : null;
    }

}

