/**
 * 
 */
package com.jfbuilds.playngame.abilities;

import com.jfbuilds.playngame.general.JFBActionInterface;
import com.jfbuilds.playngame.general.JFBConditionInterface;
import com.jfbuilds.playngame.general.JFBDisplayInterface;
import com.jfbuilds.playngame.general.JFBEventBindsInterface;
import com.jfbuilds.playngame.general.JFBResetInterface;

/**
 * @author Jean
 *
 */
public abstract class JFBAbstractAbility implements JFBAbilityInterface {
	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#isActivated()
	 */
	@Override
	public boolean isActivated() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setActivated(boolean)
	 */
	@Override
	public void setActivated(boolean activated_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#getValue()
	 */
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setValue(int)
	 */
	@Override
	public void setValue(int value_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#getCondition()
	 */
	@Override
	public JFBConditionInterface getCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setCondition(com.jfbuilds.playngame.general.JFBConditionInterface)
	 */
	@Override
	public void setCondition(JFBConditionInterface condition_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#getAction()
	 */
	@Override
	public JFBActionInterface getAction() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setAction(com.jfbuilds.playngame.general.JFBActionInterface)
	 */
	@Override
	public void setAction(JFBActionInterface action_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#getDisplay()
	 */
	@Override
	public JFBDisplayInterface getDisplay() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setDisplay(com.jfbuilds.playngame.general.JFBDisplayInterface)
	 */
	@Override
	public void setDisplay(JFBDisplayInterface display_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#getReset()
	 */
	@Override
	public JFBResetInterface getReset() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setReset(com.jfbuilds.playngame.general.JFBResetInterface)
	 */
	@Override
	public void setReset(JFBResetInterface reset_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#getEventBinds()
	 */
	@Override
	public JFBEventBindsInterface getEventBinds() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#setEventBinds(com.jfbuilds.playngame.general.JFBEventBindsInterface)
	 */
	@Override
	public void setEventBinds(JFBEventBindsInterface eventBinds_) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.abilities.JFBAbilityInterface#isAbilityCandidate(com.jfbuilds.playngame.abilities.JFBAbilityInterface)
	 */
	@Override
	public boolean isAbilityCandidate(JFBAbilityInterface candidate) {
		// TODO Auto-generated method stub
		return false;
	}

}
