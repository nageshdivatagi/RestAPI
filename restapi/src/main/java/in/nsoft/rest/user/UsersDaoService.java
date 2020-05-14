package in.nsoft.rest.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UsersDaoService {

	private static List<Users> users = new ArrayList<>();
	private static Long userCnt = (long) 6;
	static {
		users.add(new Users((long) 1, "Nagesh", new Date()));
		users.add(new Users((long)2, "rakesh", new Date()));
		users.add(new Users((long)4, "Vikki", new Date()));
		users.add(new Users((long)5, "Naveen", new Date()));
		users.add(new Users((long)6, "Kaveri", new Date()));

	}

	public List<Users> findAll() {
		return users;
	}

	public Users save(Users user) {
		if (user.getId() == null) {
			user.setId(++userCnt);
		}
		users.add(user);
		return user;
	}

	public Users findOne(int id) {
		for (Users user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public Users deleteById(int id) {
		Iterator<Users> iterator = users.iterator();

		while (iterator.hasNext()) {
			Users user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
