package in.nsoft.rest.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import in.nsoft.rest.test.DeptEmployee;
import in.nsoft.rest.test.EmployeeSearchServiceImpl;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName UserController.java
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private UserrolesRepository usersrolesRepository;

	@GetMapping("/jpa/users/{username}/users")
	public List<Users> getAllUsers(@PathVariable String username) {
	
	
		//return usersRepository.findAll();
		return usersRepository.findByUsername(username);
	}

	@GetMapping("/jpa/users/{username}/users/{id}")
	public Users getUser(@PathVariable String username, @PathVariable long id) {
		return usersRepository.findById(id).get();

	}

	@DeleteMapping("/jpa/users/{username}/users/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable String username, @PathVariable long id) {

		usersRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}

	// Edit/Update Users Details
	@PutMapping("/jpa/users/{username}/users/{id}")
	public ResponseEntity<Users> updateUsers(@PathVariable String username, @PathVariable long id,
			@RequestBody Users users) {

		Users userUpdated = usersRepository.save(users);

		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

	
	//Create new users 
	@PostMapping("/jpa/users/{username}/users")
	public ResponseEntity<Void> createTodoUsers(@PathVariable String username, @RequestBody Users users) {

		//users.setUsername(username);
		Users createdUsers = usersRepository.save(users);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(createdUsers.getUserid()).toUri();

		return ResponseEntity.created(uri).build();
	}

}
