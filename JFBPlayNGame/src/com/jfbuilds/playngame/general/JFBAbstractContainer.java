/**
 * 
 */
package com.jfbuilds.playngame.general;

import java.util.ArrayList;
import java.util.HashSet;

import com.jfbuilds.playngame.abilities.JFBAbilityInterface;
import com.jfbuilds.playngame.exceptions.AbilityImplementationException;
import com.jfbuilds.playngame.exceptions.ContainerImplementationException;
import com.jfbuilds.playngame.exceptions.ObjectiveImplementationException;
import com.jfbuilds.playngame.objectives.JFBObjectiveInterface;

/**
 * @author Jean
 *
 */
public abstract class JFBAbstractContainer implements JFBContainerInterface {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<? extends JFBContainerInterface> getContainerFamily() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContainerFamily(ArrayList<? extends JFBContainerInterface> containerFamily_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addContainer(JFBContainerInterface container_) throws ContainerImplementationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContainer(JFBContainerInterface container_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashSet<? extends JFBAbilityInterface> getAbilityFamily() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAbilityFamily(HashSet<? extends JFBAbilityInterface> abilityFamily_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAbility(JFBAbilityInterface ability_) throws AbilityImplementationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAbility(JFBAbilityInterface ability_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashSet<? extends JFBObjectiveInterface> getObjectiveFamily() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setObjectiveFamily(HashSet<? extends JFBObjectiveInterface> objectiveFamily_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObjective(JFBObjectiveInterface objective_) throws ObjectiveImplementationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObjective(JFBObjectiveInterface objective_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isContainerCandidate(JFBContainerInterface candidate) {
		// TODO Auto-generated method stub
		return false;
	}
}
