/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.scenes;

import java.util.ArrayList;

import com.jfbuilds.playngame.abilities.JFBSceneAbilityInterface;
import com.jfbuilds.playngame.fragments.JFBFragmentInterface;
import com.jfbuilds.playngame.general.JFBAbstractContainer;
import com.jfbuilds.playngame.general.JFBTransitionInterface;
import com.jfbuilds.playngame.objectives.JFBSceneObjectiveInterface;

/**
 *
 **/
public abstract class JFBAbstractScene extends JFBAbstractContainer implements JFBSceneInterface {

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#getSceneObjectives()
	 */
	@Override
	public ArrayList<JFBSceneObjectiveInterface> getSceneObjectives() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#setSceneObjectives(java.util.ArrayList)
	 */
	@Override
	public void setSceneObjectives(ArrayList<JFBSceneObjectiveInterface> sceneObjectives_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#getSceneFragments()
	 */
	@Override
	public ArrayList<JFBFragmentInterface> getSceneFragments() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#setSceneFragments(java.util.ArrayList)
	 */
	@Override
	public void setSceneFragments(ArrayList<JFBFragmentInterface> sceneFragments_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#getSceneAbilities()
	 */
	@Override
	public ArrayList<JFBSceneAbilityInterface> getSceneAbilities() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#setSceneAbilities(java.util.ArrayList)
	 */
	@Override
	public void setSceneAbilities(ArrayList<JFBSceneAbilityInterface> sceneAbilities_) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#getTransition()
	 */
	@Override
	public JFBTransitionInterface getTransition() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.scenes.JFBSceneInterface#setTransition(com.jfbuilds.playngame.general.JFBTransitionInterface)
	 */
	@Override
	public void setTransition(JFBTransitionInterface transition_) {
		// TODO Auto-generated method stub
		
	}

}