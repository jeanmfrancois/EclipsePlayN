/**
 *
 */
package com.jfbuilds.playngame.exceptions;

import java.io.Serializable;

/**
 * @author Jean
 *
 */
public class ContainerNullPointerException extends JFBNullPointerException implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -379786385904435623L;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return (super.getMessage() + ", parent element may have not been set");
	}

}