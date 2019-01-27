package StreamPrac1.StreamPrac1;

import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.log4j.*;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.java.Log;



import org.junit.Before;
import org.junit.Test;

public class TestLoggingPrac {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
	   LoggingPrac.log();
	 //  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TestLoggingPrac.class);
	  // log.info("My first log");
	  
	}

}
