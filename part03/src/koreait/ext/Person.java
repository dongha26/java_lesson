package koreait.ext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data	// getter,setter,toString,디폴트생성자
@AllArgsConstructor
@Builder
public class Person {
	private String name;
	private String mobile;
	private int age;
	private boolean gender;
}
