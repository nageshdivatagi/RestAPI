package in.nsoft.rest.roles;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName RolesRepository.java
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

	/**
	 * @param username
	 * @return
	 */

}
