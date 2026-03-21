package com.krakedev.ejercicios;

import org.apache.logging.log4j.Logger;

public class Admin {
	private Logger logger=org.apache.logging.log4j.LogManager.getLogger(Admin.class);
	
	public void agregar() {
		 logger.info("mensaje de info");
		 logger.warn("mensaje de warn");
		 logger.trace("mensaje de trace");
		 logger.error("mensaje de error");
		 logger.debug("mensaje de debug");
	}
	
}
