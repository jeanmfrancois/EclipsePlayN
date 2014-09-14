/**
 *
 */
package com.jfbuilds.playngame.exceptions;

import java.io.Serializable;

/**
 * @author Jean
 *
 */
public class JFBNullPointerException extends JFBException implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 6717848045060200519L;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return "JFB: null element exception";
	}

}