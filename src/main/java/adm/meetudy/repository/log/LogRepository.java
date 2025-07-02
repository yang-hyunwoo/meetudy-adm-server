package adm.meetudy.repository.log;

import adm.meetudy.domain.log.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
