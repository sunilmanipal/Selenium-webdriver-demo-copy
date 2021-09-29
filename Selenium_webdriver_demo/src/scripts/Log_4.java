package scripts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log_4 {

	
		public static Logger logger = LogManager.getLogger(Log_4.class);

		public static void main(String[] args) {
			logger.info("This is just a logger");
			logger.error("ERROR!!");
			logger.fatal("FATAL!!!!!!");
	}

}
