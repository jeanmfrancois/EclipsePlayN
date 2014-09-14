/**
 *
 */
package com.jfbuilds.playngame.general;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;

import java.util.ArrayList;
import java.util.HashSet;

import playn.core.GroupLayer;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.Layer;

import com.jfbuilds.playngame.abilities.JFBAbilityInterface;
import com.jfbuilds.playngame.exceptions.AbilityImplementationException;
import com.jfbuilds.playngame.exceptions.ContainerImplementationException;
import com.jfbuilds.playngame.exceptions.ContainerNullPointerException;
import com.jfbuilds.playngame.exceptions.InvalidSetGetException;
import com.jfbuilds.playngame.exceptions.ObjectiveImplementationException;
import com.jfbuilds.playngame.objectives.JFBObjectiveInterface;

/**
 * @author Jean
 *
 */
public abstract class JFBAbstractContainer implements JFBContainerInterface {

	private String name = "No Name Defined";
	private GroupLayer base;
	private int contentIndex;
	private JFBContainerInterface parent;
	private ArrayList<JFBContainerInterface> containers;
	private HashSet<JFBAbilityInterface> abilities;
	private HashSet<JFBObjectiveInterface> objectives;

	@Override
	public void addAbility(JFBAbilityInterface ability_) throws AbilityImplementationException {
		abilities.add(ability_);

	}

	@Override
	public void addContainer(JFBContainerInterface container_) throws ContainerImplementationException {
		containers.add(container_);
	}

	public void addImageLayer(float depth, String location) {
		Image image = assets().getImage(location);
		ImageLayer imageLayer = graphics().createImageLayer(image);
		imageLayer.setDepth(depth);
		getBase().add(imageLayer);
	}

	public void addImageLayer(String location) {
		Image image = assets().getImage(location);
		ImageLayer imageLayer = graphics().createImageLayer(image);
		getBase().add(imageLayer);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.jfbuilds.playngame.general.JFBContainerInterface#addLayer(playn.core
	 * .Layer)
	 */
	@Override
	public Layer addLayer(Layer layer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addObjective(JFBObjectiveInterface objective_) throws ObjectiveImplementationException {
		objectives.add(objective_);
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Container item:" + this.getName() + "has been created");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Container item:" + this.getName() + "has been destroyed");

	}

	/**
	 * @return the abilities
	 */
	@Override
	public HashSet<JFBAbilityInterface> getAbilities() {
		return abilities;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#getBase()
	 */
	@Override
	public GroupLayer getBase() {
		return base;
	}

	@Override
	public ArrayList<? extends JFBContainerInterface> getContainerFamily() {
		parent();
		return null;
	}

	/**
	 * @return the containers
	 */
	@Override
	public ArrayList<JFBContainerInterface> getContainers() {
		return containers;
	}

	/**
	 * @return the contentIndex
	 */
	@Override
	public int getContentIndex() {
		return contentIndex;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	// Ability family should be attached to ability!
	// @Override
	// public HashSet<? extends JFBAbilityInterface> getAbilityFamily() {
	// XXX
	// return null;
	// }

	/**
	 * @return the objectives
	 */
	@Override
	public HashSet<JFBObjectiveInterface> getObjectives() {
		return objectives;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#init()
	 */
	@Override
	public void init() {
		containers = new ArrayList<JFBContainerInterface>();
		abilities = new HashSet<JFBAbilityInterface>();
		objectives = new HashSet<JFBObjectiveInterface>();
		// TODO Auto-generated method stub
	}

	@Override
	public void initBase() {
		// TODO Initialize the base
	}

	@Override
	public boolean isContainerCandidate(JFBContainerInterface candidate) {
		// TODO Auto-generated method stub
		return false;
	}

	// Objective family should be attached to objective!
	// @Override
	// public HashSet<? extends JFBObjectiveInterface> getObjectiveFamily() {
	// XXX
	// return null;
	// }

	@Override
	public void load() {
		// TODO Auto-generated method stub

	}

	@Override
	public void next() {
		if (parent().getContentIndex() < parent().getContainers().size()-1) {
			// destroy the old container content
			parent().getContainers().get(parent().getContentIndex()).destroy();
			// set the parent index to n+1
			parent().setContentIndex(parent().getContentIndex() + 1);
			// set the base content of parent container to container's base content
			parent().setBase(parent().getContainers().get(parent().getContentIndex()).getBase());
			// reinitialize the container's base with new content
			parent().initBase();
		} else if (parent().getContentIndex() == parent().getContainers().size()-1) {
			System.exit(0);
		}

	}
	
	@Override
	public void previous() {
		
		if (parent().getContentIndex() > 0) {
			// destroy the old container content
			parent().getContainers().get(parent().getContentIndex()).destroy();
			// set the parent index to n+1
			parent().setContentIndex(parent().getContentIndex() - 1);
			// set the base content of parent container to container's base content
			parent().setBase(parent().getContainers().get(parent().getContentIndex()).getBase());
			// reinitialize the container's base with new content
			parent().initBase();
		} else if (parent().getContentIndex() == 0) {
			System.exit(0);
		}

	}

	/**
	 * @return the parent
	 */
	@Override
	public JFBContainerInterface parent() {
		try {
			if (parent != null) {
				return parent;
			} else {
				throw new ContainerNullPointerException();
			}
		} catch (ContainerNullPointerException e) {
			e.getMessage();
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#printBaseInfo()
	 */
	@Override
	public void printBaseInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAbility(JFBAbilityInterface ability_) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeContainer(JFBContainerInterface container_) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#removeLayer()
	 */
	@Override
	public Layer removeLayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeObjective(JFBObjectiveInterface objective_) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param abilities
	 *            the abilities to set
	 */
	@Override
	public void setAbilities(HashSet<JFBAbilityInterface> abilities) {
		try {
			throw new InvalidSetGetException();
		} catch (InvalidSetGetException e) {
			e.getMessage();
			System.out.println("Container: setAbilities");
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.jfbuilds.playngame.general.JFBContainerInterface#setBase(playn.core
	 * .GroupLayer)
	 */
	@Override
	public void setBase(GroupLayer layer_) {
		base = layer_;
	}

	@Override
	public void setContainerFamily(ArrayList<? extends JFBContainerInterface> containerFamily_) {
		try {
			throw new InvalidSetGetException();
		} catch (InvalidSetGetException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

	// Ability family should be attached to ability!
	// @Override
	// public void setAbilityFamily(HashSet<? extends JFBAbilityInterface>
	// abilityFamily_) {
	// try {
	// throw new InvalidSetGetException();
	// } catch (InvalidSetGetException e) {
	// e.getMessage();
	// e.printStackTrace();
	// }
	//
	// }

	/**
	 * @param containers
	 *            the containers to set
	 */
	@Override
	public void setContainers(ArrayList<JFBContainerInterface> containers) {
		try {
			throw new InvalidSetGetException();
		} catch (InvalidSetGetException e) {
			e.getMessage();
			System.out.println("Container: setContainers");
			e.printStackTrace();
		}
	}

	/**
	 * @param contentIndex
	 *            the contentIndex to set
	 */
	@Override
	synchronized public void setContentIndex(int contentIndex_) {
		contentIndex = contentIndex_;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.jfbuilds.playngame.general.JFBContainerInterface#setName(java.lang
	 * .String)
	 */
	@Override
	public void setName(String name_) {
		name = name_;

	}

	/**
	 * @param objectives
	 *            the objectives to set
	 */
	@Override
	public void setObjectives(HashSet<JFBObjectiveInterface> objectives) {
		try {
			throw new InvalidSetGetException();
		} catch (InvalidSetGetException e) {
			e.getMessage();
			System.out.println("Container: setObjectives");
			e.printStackTrace();
		}
	}

	// Objective family should be attached to objective!
	// @Override
	// public void setObjectiveFamily(HashSet<? extends JFBObjectiveInterface>
	// objectiveFamily_) {
	// try {
	// throw new InvalidSetGetException();
	// } catch (InvalidSetGetException e) {
	// e.getMessage();
	// e.printStackTrace();
	// }
	// }

	/**
	 * @param parent
	 *            the parent to set
	 */
	@Override
	public void setParent(JFBContainerInterface parent) {
		this.parent = parent;
	}
}
