package adm.meetudy.domain.study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyGroupMember is a Querydsl query type for StudyGroupMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyGroupMember extends EntityPathBase<StudyGroupMember> {

    private static final long serialVersionUID = 1069448624L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyGroupMember studyGroupMember = new QStudyGroupMember("studyGroupMember");

    public final adm.meetudy.domain.common.QBaseEntity _super = new adm.meetudy.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> joinApprovedAt = createDateTime("joinApprovedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> joinRequestedAt = createDateTime("joinRequestedAt", java.time.LocalDateTime.class);

    public final EnumPath<adm.meetudy.constant.study.JoinStatusEnum> joinStatus = createEnum("joinStatus", adm.meetudy.constant.study.JoinStatusEnum.class);

    public final DateTimePath<java.time.LocalDateTime> leftAt = createDateTime("leftAt", java.time.LocalDateTime.class);

    public final adm.meetudy.domain.member.QMember member;

    public final DateTimePath<java.time.LocalDateTime> rejectAt = createDateTime("rejectAt", java.time.LocalDateTime.class);

    public final EnumPath<adm.meetudy.constant.study.MemberRole> role = createEnum("role", adm.meetudy.constant.study.MemberRole.class);

    public final QStudyGroup studyGroup;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedBy = _super.updatedBy;

    public QStudyGroupMember(String variable) {
        this(StudyGroupMember.class, forVariable(variable), INITS);
    }

    public QStudyGroupMember(Path<? extends StudyGroupMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyGroupMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyGroupMember(PathMetadata metadata, PathInits inits) {
        this(StudyGroupMember.class, metadata, inits);
    }

    public QStudyGroupMember(Class<? extends StudyGroupMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
        this.studyGroup = inits.isInitialized("studyGroup") ? new QStudyGroup(forProperty("studyGroup"), inits.get("studyGroup")) : null;
    }

}

