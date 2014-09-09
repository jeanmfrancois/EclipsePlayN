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
	public enum FragmentType {
		CONTROLABLE_CHARACTER (2000, false, 100114),
		NONCONTROLABLE_CHARACTER (2010, true, 100114),
		BACKGROUND_LAYER (3000, false, 100114),
		FORGROUND_LAYER (3010, false, 100114),
		WALKABLE_MAP  (4000, false, 100114),
		SWIMMABLE_MAP (4050, false, 100114);
		
		private final int id;
		private final boolean multipleAllowed;
		private final int creationStamp;
		
		FragmentType(int id_, boolean multipleAllowed_, int creationStamp_) {
			id = id_;
			multipleAllowed = multipleAllowed_;
			creationStamp = creationStamp_;
		}
		
		public int id() {
			return id;
		}
		
		public boolean multipleAllowed() {
			return multipleAllowed;
		}
		
		public int creationStamp() {
			return creationStamp;
		}
		
		public String toString() {
			return String.valueOf(multipleAllowed());
		}
	}
	public ArrayList<? extends JFBContainerCollectionInterface> getFamily();
	public String getName();
}
