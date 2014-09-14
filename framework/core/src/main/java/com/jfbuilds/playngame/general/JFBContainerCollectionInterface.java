/**
 *
 */
package com.jfbuilds.playngame.general;

import java.util.ArrayList;

/**
 * @author Jean
 *
 */
public interface JFBContainerCollectionInterface {

	public ArrayList<? extends JFBContainerCollectionInterface> getFamily();

	public String getName();
}
