/**
 * 
 */
package in.nsoft.rest.menu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import in.nsoft.rest.roles.Roles;
import in.nsoft.rest.roles.Rolespages;
import in.nsoft.rest.users.Userroles;
import in.nsoft.rest.users.Users;

/**
 * @author nages
 *
 * @CreateDate 23-Apr-2020 7:57:16 pm
 * @FileNam MenuService.java
 */

@Component
public class MenuService {
	private EntityManager entityManager;
	private CriteriaBuilder criteriaBuilder;

	public MenuService(EntityManager entityManager) {
		this.entityManager = entityManager;
		this.criteriaBuilder = entityManager.getCriteriaBuilder();

	}

	public List<Menu> getMenuList(int userid) {

	//	entityManager.getTransaction().begin();
		criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Menu> criteriaQuery = createCriteriaQuery(Menu.class);
		
		Root<Menu> menu = criteriaQuery.from(Menu.class);
		//Join<Object, Object> book = menu.join(Rolespages_.book);
		 
		Join<Menu, Rolespages> rolepage = menu.join("rolespages",JoinType.INNER);
		Join<Rolespages, Roles> roles = rolepage.join("roles",JoinType.INNER);
		Join<Roles, Userroles> userroles = roles.join("userroles",JoinType.INNER);
		Join<Userroles, Users> users = userroles.join("users",JoinType.INNER);
		
		criteriaQuery.select(menu);
		criteriaQuery.where(criteriaBuilder.equal(users.get("ur_userid"), 1));
		TypedQuery<Menu> query = entityManager.createQuery(criteriaQuery);
		
		//Subquery<Menu> subquery = criteriaQuery.subquery(Menu.class);
		//Root<Menu> dept = emp.from(Menu.class);
		List<Menu> data = query.getResultList();
	//	entityManager.getTransaction().commit();
		return  data;

	}

	/**
	 * @param class1
	 * @return
	 */
	private <T> CriteriaQuery<T> createCriteriaQuery(Class<T> klass) {
		return criteriaBuilder.createQuery(klass);
	}
}
