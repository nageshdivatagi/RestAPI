package in.nsoft.rest.roles;

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

import in.nsoft.rest.users.UserrolesRepository;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName RolesController.java
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RolesController {

	@Autowired
	private RolesRepository rolesRepository;

	@Autowired
	private UserrolesRepository usersrolesRepository;

	@GetMapping("/jpa/users/{username}/roles")
	public List<Roles> getAllRoles(@PathVariable String username) {

		return rolesRepository.findAll();
	}

	@GetMapping("/jpa/users/{username}/roles/{id}")
	public Roles getRoles(@PathVariable String username, @PathVariable long id) {
		return rolesRepository.findById(id).get();

	}

	@DeleteMapping("/jpa/users/{username}/roles/{id}")
	public ResponseEntity<Void> deleteRoles(@PathVariable String username, @PathVariable long id) {

		rolesRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}

	// Edit/Update Users Details
	@PutMapping("/jpa/users/{username}/roles/{id}")
	public ResponseEntity<Roles> updateRoles(@PathVariable String username, @PathVariable long id,
			@RequestBody Roles roles) {

		Roles rolesUpdated = rolesRepository.save(roles);

		return new ResponseEntity<Roles>(roles, HttpStatus.OK);
	}

	// Create new users
	@PostMapping("/jpa/users/{username}/roles")
	public ResponseEntity<Void> createRoles(@PathVariable String username, @RequestBody Roles roles) {

		// roles.setUsername(username);
		Roles createdUsers = rolesRepository.save(roles);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(createdUsers.getRoleid()).toUri();

		return ResponseEntity.created(uri).build();
	}

}
