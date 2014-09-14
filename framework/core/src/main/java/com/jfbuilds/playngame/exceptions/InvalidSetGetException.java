/**
 *
 */
package com.jfbuilds.playngame.exceptions;

import java.io.Serializable;

/**
 * @author Jean
 *
 */
public class InvalidSetGetException extends JFBInvalidMethodExecutionException implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5414110157468436923L;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return (super.getMessage() + ", possibly setting or getting a value which should not have been accessed in that manner");
	}

}