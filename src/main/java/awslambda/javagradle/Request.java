package awslambda.javagradle;

import java.util.Map;

public class Request {
	private String message;

	public Request(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
