package com.irsan.javaexercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class JavaexercisespringbootApplicationTests {

	@Test
	void contextLoads() {
		String datetime = "13-01-1999 00:00:00";
		String epoch = "916160400000L";
		Pattern regex = Pattern.compile("[:-]");
		Matcher hasRegex = regex.matcher(epoch);
		System.out.println(hasRegex.find());
	}

}
