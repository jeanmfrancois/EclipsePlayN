/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.general;

import java.util.ArrayList;
import java.util.HashSet;

import com.jfbuilds.playngame.abilities.JFBAbilityInterface;
import com.jfbuilds.playngame.objectives.JFBObjectiveInterface;
import com.jfbuilds.playngame.scenes.JFBSceneInterface;

/**
 *
 **/
public interface JFBGameInterface extends JFBContainerInterface {

	/* ===================================== */
	/* == Member Variables == */
	/* ===================================== */

	// private ArrayList<JFBSceneInterface> gameScenes;
	//
	// private ArrayList<JFBGameAbilityInterface> gameAbilities;
	//
	// private ArrayList<JFBGameObjectives> gameObjectives;
	//
	// private JFBSceneInterface currectScene;
	//
	// private int currentSceneIndex;

	/* ===================================== */
	/* == Methods == */
	/* ===================================== */

	/**
	 *
	 **/
	public void createScenes();

	/**
	 *
	 **/
	public JFBSceneInterface getCurrentScene();

	/**
	 *
	 **/
	public HashSet<JFBAbilityInterface> getGameAbilities();

	/**
	 *
	 **/
	public HashSet<JFBObjectiveInterface> getGameObjectives();

	/**
	 *
	 **/
	public ArrayList<JFBContainerInterface> getGameScenes();

	/**
	 *
	 **/
	public void initScenes();

	/**
	 *
	 **/
	public void setCurrentScene(JFBSceneInterface currentScene_);

	/**
	 *
	 **/
	public void setGameAbilities(HashSet<JFBAbilityInterface> gameAbilities_);

	/**
	 *
	 **/
	public void setGameObjectives(HashSet<JFBObjectiveInterface> gameObjectives_);

	/**
	 *
	 **/
	public void setGameScenes(ArrayList<JFBContainerInterface> gameScenes_);

}