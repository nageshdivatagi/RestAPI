package in.nsoft.rest.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nsoft.rest.test.DeptEmployee;
/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName UserrolesRepository.java
 */
@Repository
public interface UserrolesRepository extends JpaRepository<Userroles, Long> {

	
	
	

}
