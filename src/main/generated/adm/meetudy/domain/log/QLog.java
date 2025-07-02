package adm.meetudy.domain.log;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLog is a Querydsl query type for Log
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLog extends EntityPathBase<Log> {

    private static final long serialVersionUID = -460423361L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLog log = new QLog("log");

    public final StringPath errorMsg = createString("errorMsg");

    public final StringPath httpMethod = createString("httpMethod");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final adm.meetudy.domain.member.QMember member;

    public final StringPath methodName = createString("methodName");

    public final StringPath request = createString("request");

    public final StringPath response = createString("response");

    public final BooleanPath sucesStts = createBoolean("sucesStts");

    public final StringPath uuid = createString("uuid");

    public QLog(String variable) {
        this(Log.class, forVariable(variable), INITS);
    }

    public QLog(Path<? extends Log> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLog(PathMetadata metadata, PathInits inits) {
        this(Log.class, metadata, inits);
    }

    public QLog(Class<? extends Log> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new adm.meetudy.domain.member.QMember(forProperty("member")) : null;
    }

}

