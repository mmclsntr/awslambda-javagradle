package awslambda.javagradle;

import java.util.Collections;
import java.util.Map;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, Response> {

	private static final Logger LOG = Logger.getLogger(Handler.class.getName());

	@Override
	public Response handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: " + input);
        LOG.setLevel(Level.INFO);

        Greeting greetingBody = new Greeting("Hello");

		return Response.builder()
				.setStatusCode(200)
				.setObjectBody(greetingBody)
				.build();
	}
}
