/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.fragments;

import com.jfbuilds.playngame.general.JFBActionInterface;
import com.jfbuilds.playngame.general.JFBConditionInterface;
import com.jfbuilds.playngame.general.JFBContainerInterface;
import com.jfbuilds.playngame.general.JFBEventBindsInterface;
import com.jfbuilds.playngame.general.JFBPositionInterface;
import com.jfbuilds.playngame.general.JFBTransitionInterface;

/**
 *
 **/
public interface JFBFragmentInterface extends JFBContainerInterface {

	/* ===================================== */
	/* == FragmentType enum == */
	/* ===================================== */

	public enum FragmentType {
		SIMPLE_FRAGMENT(1000, true, 100114), CONTROLABLE_CHARACTER(2000, false, 100114), NONCONTROLABLE_CHARACTER(2010,
				true, 100114), BACKGROUND_LAYER(3000, false, 100114), FORGROUND_LAYER(3010, false, 100114), WALKABLE_MAP(
						4000, false, 100114), SWIMMABLE_MAP(4050, false, 100114);

		private final int id;
		private final boolean multipleAllowed;
		private final int creationStamp;

		FragmentType(int id_, boolean multipleAllowed_, int creationStamp_) {
			id = id_;
			multipleAllowed = multipleAllowed_;
			creationStamp = creationStamp_;
		}

		public int creationStamp() {
			return creationStamp;
		}

		public int id() {
			return id;
		}

		public boolean multipleAllowed() {
			return multipleAllowed;
		}

		@Override
		public String toString() {
			return String.valueOf(multipleAllowed());
		}
	}

	/* ===================================== */
	/* == Member Variables == */
	/* ===================================== */

	// FragmentType fragmentType = FragmentType.SIMPLE_FRAGMENT;
	//
	// JFBPositionInterface startPosition = null;
	//
	// JFBPositionInterface endPostion = null;
	//
	// JFBTransitionInterface transition = null;
	//
	// JFBActionInterface action = null;
	//
	// JFBConditionInterface condition = null;
	//
	// JFBEventBindsInterface eventBinds = null;

	/* ===================================== */
	/* == Methods == */
	/* ===================================== */

	/**
	 *
	 **/
	public JFBActionInterface getAction();

	/**
	 *
	 **/
	public JFBConditionInterface getCondition();

	/**
	 *
	 **/
	public JFBPositionInterface getEndPostion();

	/**
	 *
	 **/
	public JFBEventBindsInterface getEventBinds();

	/**
	 *
	 **/
	public FragmentType getFragmentType();

	/**
	 *
	 **/
	public JFBPositionInterface getStartPosition();

	/**
	 *
	 **/
	public JFBTransitionInterface getTransition();

	/**
	 *
	 **/
	public void setAction(JFBActionInterface action_);

	/**
	 *
	 **/
	public void setCondition(JFBConditionInterface condition_);

	/**
	 *
	 **/
	public void setEndPostion(JFBPositionInterface endPostion_);

	/**
	 *
	 **/
	public void setEventBinds(JFBEventBindsInterface eventBinds_);

	/**
	 *
	 **/
	public void setFragmentType(FragmentType fragmentType_);

	/**
	 *
	 **/
	public void setStartPosition(JFBPositionInterface startPosition_);

	/**
	 *
	 **/
	public void setTransition(JFBTransitionInterface transition_);

}