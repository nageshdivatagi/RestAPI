/**
 * 
 */
package in.nsoft.rest.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nsoft.rest.user.Users;

/**
 * @author nages
 *
 * @CreateDate 23-Apr-2020 4:48:49 pm
 * @FileNam TestController.java
 */

@RestController
public class TestController {

	@Autowired
	private EmployeeSearchServiceImpl employeeSearchService;

	@GetMapping("/emp")
	public List<DeptEmployee> getAllUsers() {
System.out.println("Comming inside");
		List<DeptEmployee> data = employeeSearchService.searchByDepartmentQuery("IT");
		System.out.println(data);
		return data;
	}
}
