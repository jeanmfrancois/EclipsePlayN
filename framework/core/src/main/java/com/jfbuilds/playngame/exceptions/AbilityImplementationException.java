/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.exceptions;

import java.io.Serializable;

/**
 *
 **/
public class AbilityImplementationException extends JFBImplementationException implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7392165759485312000L;

	@Override
	public String getMessage() {
		return super.getMessage() + ", possibly adding an ability which does not implement a specific interface";
	}

}