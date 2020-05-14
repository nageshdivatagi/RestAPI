package in.nsoft.rest.ble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nagesh.divatagi
 * 
 */
@Repository
public interface DataRepository extends JpaRepository<Getdata, Long> {

}
