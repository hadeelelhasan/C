package calcu;
import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import modol;
//import Calc.View;

class testing {
	
	modol m1;
	View v1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		m1=new modol();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test ()
	void test() {
		
		m1.add(3, 3);
		assertEquals(m1.getTheRes(),6);
	
		m1.sq(-3);
		assertEquals(m1.getCheck(),1);
	    m1.div(4, 0);
		 assertEquals(m1.getCheck(),1);
	    m1.mod(2, 0);
		 assertEquals(m1.getCheck(),1);
		 
		 m1.sub(5, 1);
			assertEquals(m1.getTheRes(),4);
			m1.mul(3, 3);
			assertEquals(m1.getTheRes(),9);
	        m1.div(4, 2);
			assertEquals(m1.getTheRes(),2);
	        m1.sq(4);
			assertEquals(m1.getTheRes(),2);
			m1.mod(7, 3);
			 assertEquals(m1.getTheRes(),1);
		// m1.add("had", 9);
		 
	}

}
