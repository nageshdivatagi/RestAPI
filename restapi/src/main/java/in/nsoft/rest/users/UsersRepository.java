package in.nsoft.rest.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName UsersRepository.java
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	/**
	 * @param username
	 * @return
	 */
	List<Users> findByUsername(String username);
	
	

}
