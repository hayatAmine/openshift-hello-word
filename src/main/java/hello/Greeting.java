package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

	private final String content;
	private final long code;

	@JsonCreator
	public Greeting(@JsonProperty("code") long code,
			@JsonProperty("content") String content) {
		this.content = content;
		this.code = code;
	}

	public long getCode() {
		return code;
	}

	public String getContent() {
		return content;
	}
}