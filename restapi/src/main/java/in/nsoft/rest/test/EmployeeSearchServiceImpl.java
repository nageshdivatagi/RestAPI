package in.nsoft.rest.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

import org.springframework.stereotype.Component;

@Component
public class EmployeeSearchServiceImpl {

	private EntityManager entityManager;
	private CriteriaBuilder criteriaBuilder;

	public EmployeeSearchServiceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
		this.criteriaBuilder = entityManager.getCriteriaBuilder();

	}

	public List<DeptEmployee> filterbyTitleUsingCriteriaBuilder(List<String> titles) {
		CriteriaQuery<DeptEmployee> criteriaQuery = createCriteriaQuery(DeptEmployee.class);
		Root<DeptEmployee> root = criteriaQuery.from(DeptEmployee.class);
		In<String> inClause = criteriaBuilder.in(root.get("title"));
		for (String title : titles) {
			inClause.value(title);
		}
		criteriaQuery.select(root).where(inClause);
		TypedQuery<DeptEmployee> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}

	public List<DeptEmployee> filterbyTitleUsingExpression(List<String> titles) {
		CriteriaQuery<DeptEmployee> criteriaQuery = createCriteriaQuery(DeptEmployee.class);
		Root<DeptEmployee> root = criteriaQuery.from(DeptEmployee.class);
		criteriaQuery.select(root).where(root.get("title").in(titles));
		TypedQuery<DeptEmployee> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}

	public List<DeptEmployee> searchByDepartmentQuery(String searchKey) {
		CriteriaQuery<DeptEmployee> criteriaQuery = createCriteriaQuery(DeptEmployee.class);
		Root<DeptEmployee> emp = criteriaQuery.from(DeptEmployee.class);

		Subquery<Department> subquery = criteriaQuery.subquery(Department.class);
		Root<Department> dept = subquery.from(Department.class);
		subquery.select(dept).distinct(true).where(
				criteriaBuilder.like(dept.get("name"), new StringBuffer("%").append(searchKey).append("%").toString()));

		criteriaQuery.select(emp).where(criteriaBuilder.in(emp.get("department")).value(subquery));

		TypedQuery<DeptEmployee> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}

	private <T> CriteriaQuery<T> createCriteriaQuery(Class<T> klass) {
		return criteriaBuilder.createQuery(klass);
	}

}
