package scripts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4j_example {
	public static Logger logger = LogManager.getLogger(log4j_example.class);

	public static void main(String[] args) {
		logger.info("This is just a logger");
		logger.error("ERROR!!");
		logger.fatal("FATAL!!!!!!");

	}

}
