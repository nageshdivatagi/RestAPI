package in.nsoft.rest.ble;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

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
public class DataJPAController {

	@Autowired
	private DataDaoService dataDaoService;

	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private PowercutRepository powerCutRepo;

	@GetMapping("/getbledata")
	public List<Getdata> getAllUsers() {
		List<Getdata> list = dataRepository.findAll();

		return list;
	}

	@GetMapping("/sendbledata/{id}")
	public Resource<Getdata> getAllUsers(@PathVariable int id) {

		Optional<Getdata> getdata = dataRepository.findById((long) id);
		if (getdata == null)
			throw new UserNotFoundException("id-" + id);
		// HATEOAS Hypermedia As The Engine Of Application State

		// "all-users", SERVER_PATH + "/sendbledata"
		// retrieveAllUsers
		Resource<Getdata> resource = new Resource<Getdata>(getdata.get());

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());

		resource.add(linkTo.withRel("Read-All-BLE-Data"));

		// HATEOAS

		return resource;
	}

	@PostMapping("/sendbledata")
	public ResponseEntity<Object> getAllUsers(@Valid @RequestBody Getdata getdata) throws ParseException {

		return dataDaoService.commonData(getdata);
	}

	@DeleteMapping("/sendbledata/{id}")
	public void getDeleteUsers(@PathVariable int id) {

		dataRepository.deleteById((long) id);

	}

	// Send Commond Response

	@GetMapping("/sendcmdresponse")
	public List<Powercut> getAllCommandResponse() {
		List<Powercut> list = powerCutRepo.findAll();

		return list;
	}

	@GetMapping("/sendcmdresponse/{id}")
	public Resource<Powercut> getCommandResponseBasedOnId(@PathVariable int id) {

		Optional<Powercut> getdata = powerCutRepo.findById((long) id);
		if (getdata == null)
			throw new UserNotFoundException("id-" + id);
		// HATEOAS Hypermedia As The Engine Of Application State

		// "all-users", SERVER_PATH + "/sendbledata"
		// retrieveAllUsers
		Resource<Powercut> resource = new Resource<Powercut>(getdata.get());

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());

		resource.add(linkTo.withRel("Read-All-BLE-Data"));

		// HATEOAS

		return resource;
	}

	@PostMapping("/sendcmdresponse")
	public ResponseEntity<Object> getPostCommandResponse(@Valid @RequestBody Powercut powercut) throws ParseException {

		Powercut savedData = powerCutRepo.save(powercut);

		// smartRepository
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedData.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping("/sendcmdresponse/{id}")
	public void getDeleteCommandResponse(@PathVariable int id) {

		powerCutRepo.deleteById((long) id);

	}

}
