/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.exceptions;

import java.io.Serializable;

/**
 *
 **/
public class ContainerImplementationException extends JFBImplementationException implements Serializable {

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return super.getMessage() + ", possibly adding a container object which does not implement a specific interface";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4680565654899236069L;

}