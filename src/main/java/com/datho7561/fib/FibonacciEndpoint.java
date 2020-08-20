package com.datho7561.fib;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/fibonacci")
public class FibonacciEndpoint {

	@Inject
	@ConfigProperty(name = "sequence.length", defaultValue = "10")
	int length;

	@Inject
	@ConfigProperty(name = "sequence.delimeter", defaultValue = ", ")
	String delimiter;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getListOfFib() {
		return prettyPrint(Fibonacci.fibSeq(length));
	}

	/**
	 * Build a pretty string representation of an integer list
	 *
	 * @param intList The integer list to build a string representation of
	 * @return
	 */
	private String prettyPrint(List<Integer> intList) {
		StringBuilder stringRep = new StringBuilder("[");
		if (intList.size() > 0) {
			for (int i = 0; i < intList.size() - 1; i++) {
				stringRep.append(intList.get(i)).append(delimiter);
			}
			stringRep.append(intList.get(intList.size() - 1));
		}
		stringRep.append("]");
		return stringRep.toString();
	}

}