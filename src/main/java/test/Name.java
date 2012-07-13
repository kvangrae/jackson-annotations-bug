package test;

import static org.apache.commons.lang3.Validate.notNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
	private final String first;
	private final String last;
	@JsonCreator
	public Name(@JsonProperty("first") String first, @JsonProperty("last") String last) {
//		notNull(first);
//		notNull(last);
		this.first = first;
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
}

