package in.nsoft.rest.user;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import java.net.URI;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import in.nsoft.rest.exception.UserNotFoundException;

@RestController
public class UserController {

	@Autowired
	private UsersDaoService userDaoService;

	@GetMapping("/users")
	public List<Users> getAllUsers() {
		
		EntityManagerFactory entity = Persistence.createEntityManagerFactory("DBConnect");
		EntityManager em = entity.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Users> query =  cb.createQuery(Users.class);
		Root<Users> from =query.from(Users.class);
		query.select(from);
		
		TypedQuery<Users> typedQueery = em.createQuery(query);
		
		List<Users> list = typedQueery.getResultList();
		System.out.println("Nagesh");
		for (Users users : list) {
			System.out.println(users);
		}
		entity.close();
		em.close();
		
		//List<Users> list = userDaoService.findAll();

		return list;
	}

	@GetMapping("/users/{id}")
	public Resource<Users> getAllUsers(@PathVariable int id) {

		Users user = userDaoService.findOne(id);
		if (user == null)
			throw new UserNotFoundException("id-" + id);
		// HATEOAS Hypermedia As The Engine Of Application State

		// "all-users", SERVER_PATH + "/users"
		// retrieveAllUsers
		Resource<Users> resource = new Resource<Users>(user);

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());

		resource.add(linkTo.withRel("all-users"));

		// HATEOAS

		return resource;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> getAllUsers(@Valid @RequestBody Users user) {

		Users savedUser = userDaoService.save(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping("/users/{id}")
	public void getDeleteUsers(@PathVariable int id) {

		Users user = userDaoService.deleteById(id);
		if (user == null) {
			throw new UserNotFoundException("id-" + id);
		}

	}

}
