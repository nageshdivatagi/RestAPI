package in.nsoft.rest.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName PagesRepository.java
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{

	
}
