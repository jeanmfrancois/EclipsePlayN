/**
 * 
 */
package com.jfbuilds.playngame.objectives;

import com.jfbuilds.playngame.general.JFBActionInterface;
import com.jfbuilds.playngame.general.JFBConditionInterface;
import com.jfbuilds.playngame.general.JFBEventBindsInterface;
import com.jfbuilds.playngame.general.JFBResetInterface;
import com.jfbuilds.playngame.general.JFBStatusInterface;


/**
 * @author Jean
 *
 */
public abstract class JFBAbstractObjective implements JFBObjectiveInterface {

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#isActivated()
	 */
	@Override
	public boolean isActivated() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setActivated(boolean)
	 */
	@Override
	public void setActivated(boolean activated_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getValue()
	 */
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setValue(int)
	 */
	@Override
	public void setValue(int value_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getSteps()
	 */
	@Override
	public int getSteps() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setSteps(int)
	 */
	@Override
	public void setSteps(int steps_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getIncrementalValue()
	 */
	@Override
	public int getIncrementalValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setIncrementalValue(int)
	 */
	@Override
	public void setIncrementalValue(int incrementalValue_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getCondition()
	 */
	@Override
	public JFBConditionInterface getCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setCondition(com.jfbuilds.playngame.general.JFBConditionInterface)
	 */
	@Override
	public void setCondition(JFBConditionInterface condition_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getStatus()
	 */
	@Override
	public JFBStatusInterface getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setStatus(com.jfbuilds.playngame.general.JFBStatusInterface)
	 */
	@Override
	public void setStatus(JFBStatusInterface status_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getIncrementalAction()
	 */
	@Override
	public JFBActionInterface getIncrementalAction() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setIncrementalAction(com.jfbuilds.playngame.general.JFBActionInterface)
	 */
	@Override
	public void setIncrementalAction(JFBActionInterface incrementalAction_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getGoalAction()
	 */
	@Override
	public JFBActionInterface getGoalAction() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setGoalAction(com.jfbuilds.playngame.general.JFBActionInterface)
	 */
	@Override
	public void setGoalAction(JFBActionInterface goalAction_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getReset()
	 */
	@Override
	public JFBResetInterface getReset() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setReset(com.jfbuilds.playngame.general.JFBResetInterface)
	 */
	@Override
	public void setReset(JFBResetInterface reset_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#getEventBinds()
	 */
	@Override
	public JFBEventBindsInterface getEventBinds() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#setEventBinds(com.jfbuilds.playngame.general.JFBEventBindsInterface)
	 */
	@Override
	public void setEventBinds(JFBEventBindsInterface eventBinds_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.objectives.JFBObjectiveInterface#isObjectiveCandidate(com.jfbuilds.playngame.objectives.JFBObjectiveInterface)
	 */
	@Override
	public boolean isObjectiveCandidate(JFBObjectiveInterface candidate) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
