package in.nsoft.rest.ble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowercutRepository extends JpaRepository<Powercut, Long> {

}
