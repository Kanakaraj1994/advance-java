package io.demo;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathutilTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("hi it failed");
		
		mathutil mt=new mathutil();
		int expected=2;
		int actual=mt.add(1,1);
		assertEquals(expected,actual);
	}

}
