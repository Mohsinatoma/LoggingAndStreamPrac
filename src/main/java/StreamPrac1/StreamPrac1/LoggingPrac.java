package StreamPrac1.StreamPrac1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.log4j.*;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.java.Log;


@Log
public class LoggingPrac {
    
	public static void log() {
		System.out.print("f");
		log.info("My first log");
	}
}


