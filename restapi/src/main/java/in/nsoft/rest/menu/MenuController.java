package in.nsoft.rest.menu;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName PagesController.java
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MenuController {

	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private MenuService menuService;

	@GetMapping("/jpa/users/{username}/menu")
	public List<Menu> getAllPages(@PathVariable String username) {

		List<Menu> list = menuService.getMenuList(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Id: " + list.get(i).id + " Href: " + list.get(i).href + " routerLink: "
					+ list.get(i).routerLink + " title: " + list.get(i).title + " Icon: " + list.get(i).icon
					+ " traget: " + list.get(i).target + " hasSubMenu: " + list.get(i).hasSubMenu + " Parent_Id: "
					+ list.get(i).parentId);
		}

		return list;//menuRepository.findAll();
	}

	@GetMapping("/jpa/users/{username}/menu/{userid}")
	public Optional<Menu> getPages(@PathVariable String username, @PathVariable long userid) {
		return menuRepository.findById(userid);
	}

	// DELETE /users/{username}/todos/{id}
	@DeleteMapping("/jpa/users/{username}/menu/{userid}")
	public ResponseEntity<Void> deletePage(@PathVariable long userid) {

		menuRepository.deleteById(userid);

		return ResponseEntity.noContent().build();

	}

	// Edit/Update a Todo
	@PutMapping("/jpa/users/{username}/menu/{id}")
	public ResponseEntity<Menu> updatePages(@PathVariable String username, @PathVariable long id,
			@RequestBody Menu menu) {

		Menu todoUpdated = menuRepository.save(menu);

		return new ResponseEntity<Menu>(menu, HttpStatus.OK);
	}

	/**
	 * Create an New Pages in the Reposito
	 * 
	 */
	@PostMapping("/jpa/users/{username}/menu")
	public ResponseEntity<Void> createPages(@PathVariable String username, @RequestBody Menu menu) {

		Menu createdTodo = menuRepository.save(menu);

		// Location
		// Get current resource url
		/// {id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

}
