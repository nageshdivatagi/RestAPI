package in.nsoft.rest.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String messages) {
		this.message = messages;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloworldBean [message=%s]", message);
	}

}
