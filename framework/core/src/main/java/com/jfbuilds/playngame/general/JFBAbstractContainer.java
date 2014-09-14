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

	/**
	 * @return the containers
	 */
	public ArrayList<JFBContainerInterface> getContainers() {
		return containers;
	}
	/**
	 * @param containers the containers to set
	 */
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
	 * @return the abilities
	 */
	public HashSet<JFBAbilityInterface> getAbilities() {
		return abilities;
	}
	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(HashSet<JFBAbilityInterface> abilities) {
		try {
			throw new InvalidSetGetException();
		} catch (InvalidSetGetException e) {
			e.getMessage();
			System.out.println("Container: setAbilities");
			e.printStackTrace();
		}
	}
	/**
	 * @return the objectives
	 */
	public HashSet<JFBObjectiveInterface> getObjectives() {
		return objectives;
	}
	/**
	 * @param objectives the objectives to set
	 */
	public void setObjectives(HashSet<JFBObjectiveInterface> objectives) {
		try {
			throw new InvalidSetGetException();
		} catch (InvalidSetGetException e) {
			e.getMessage();
			System.out.println("Container: setObjectives");
			e.printStackTrace();
		}
	}

	private String name = "No Name Defined";
	private GroupLayer base;
	private int contentIndex;
	private JFBContainerInterface parent;
	private ArrayList<JFBContainerInterface> containers;
	private HashSet<JFBAbilityInterface> abilities;
	private HashSet<JFBObjectiveInterface> objectives;
	
	@Override
	public void addAbility(JFBAbilityInterface ability_) throws AbilityImplementationException {
		abilities.add((JFBAbilityInterface)ability_);
		
	}
	@Override
	public void addContainer(JFBContainerInterface container_) throws ContainerImplementationException {
		containers.add((JFBContainerInterface)container_);
	}
	@Override
	public void addObjective(JFBObjectiveInterface objective_) throws ObjectiveImplementationException {
		objectives.add((JFBObjectiveInterface)objective_);
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
	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#addLayer(playn.core.Layer)
	 */
	@Override
	public Layer addLayer(Layer layer) {
		// TODO Auto-generated method stub
		return null;
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

//  Ability family should be attached to ability!
//	@Override
//	public HashSet<? extends JFBAbilityInterface> getAbilityFamily() {
//		XXX
//		return null;
//	}

	/* (non-Javadoc)
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
	 * @return the contentIndex
	 */
	@Override
	public int getContentIndex() {
		return contentIndex;
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

//  Objective family should be attached to objective!
//	@Override
//	public HashSet<? extends JFBObjectiveInterface> getObjectiveFamily() {
//		XXX
//		return null;
//	}

	/* (non-Javadoc)
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

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		//ArrayList<? extends JFBContainerInterface> family = getContainerFamily();
		System.out.println("Parent of " + this.getName() + " is: " + parent().getName());
		int parentIndex = parent().getContentIndex();
		System.out.println("Parent index:" + parentIndex);
		int nextIndex = parentIndex + 1;
		System.out.println("Next index:" + nextIndex);
		parent().setContentIndex(nextIndex);
		
		parent().getContainers().get(parentIndex).destroy();
		parent().setBase(parent().getContainers().get(nextIndex).getBase());
		parent().initBase();
		
		
	}

	/**
	 * @return the parent
	 */
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

	/* (non-Javadoc)
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

	/* (non-Javadoc)
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

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

//  Ability family should be attached to ability!
//	@Override
//	public void setAbilityFamily(HashSet<? extends JFBAbilityInterface> abilityFamily_) {
//		try {
//			throw new InvalidSetGetException();
//		} catch (InvalidSetGetException e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//		
//	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#setBase(playn.core.GroupLayer)
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

	/**
	 * @param contentIndex the contentIndex to set
	 */
	@Override
	synchronized public void setContentIndex(int contentIndex_) {
		contentIndex = contentIndex_;
	}
	
	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.JFBContainerInterface#setName(java.lang.String)
	 */
	@Override
	public void setName(String name_) {
		name = name_;
		
	}

//  Objective family should be attached to objective!
//	@Override
//	public void setObjectiveFamily(HashSet<? extends JFBObjectiveInterface> objectiveFamily_) {
//		try {
//			throw new InvalidSetGetException();
//		} catch (InvalidSetGetException e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * @param parent the parent to set
	 */
	@Override
	public void setParent(JFBContainerInterface parent) {
		this.parent = parent;
	}
}
