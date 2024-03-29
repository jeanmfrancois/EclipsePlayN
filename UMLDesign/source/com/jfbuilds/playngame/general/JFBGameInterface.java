/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.general;

/**
 *
 **/
public interface JFBGameInterface extends JFBContainerInterface {

    /* ===================================== */
    /* ==         Member Variables        == */
    /* ===================================== */

    private ArrayList<JFBSceneInterface> gameScenes;

    private ArrayList<JFBGameAbilityInterface> gameAbilities;

    private ArrayList<JFBGameObjectives> gameObjectives;

    private JFBSceneInterface currectScene;

    private int currentSceneIndex;

    /* ===================================== */
    /* ==         Methods                 == */
    /* ===================================== */

    /**
     *
     **/
    public ArrayList<JFBGameAbilityInterface> getGameAbilities() {
        return gameAbilities;
    }

    /**
     *
     **/
    public void setGameAbilities(ArrayList<JFBGameAbilityInterface> gameAbilities_) {
        gameFunctions = gameFunctions_;
    }

    /**
     *
     **/
    public ArrayList<JFBSceneInterface> getGameScenes() {
        return gameScenes;
    }

    /**
     *
     **/
    public void setGameScenes(ArrayList<JFBSceneInterface> gameScenes_) {
        gameScenes = gameScenes_;
    }

    /**
     *
     **/
    public ArrayList<JFBGameObjectives> getGameObjectives() {
        return gameObjectives;
    }

    /**
     *
     **/
    public void setGameObjectives(ArrayList<JFBGameObjectives> gameObjectives_) {
        gameObjectives = gameObjectives_;
    }

    /**
     *
     **/
    public void createGame() {

    }

    /**
     *
     **/
    public void destroyGame() {

    }

    /**
     *
     **/
    public void loadGame() {

    }

    /**
     *
     **/
    public void saveGame() {

    }

    /**
     *
     **/
    public void pauseGame() {

    }

    /**
     *
     **/
    public JFBSceneInterface getCurrectScene() {
        return currectScene;
    }

    /**
     *
     **/
    public void setCurrectScene(JFBSceneInterface currectScene_) {
        currectScene = currectScene_;
    }

    /**
     *
     **/
    public int getCurrentSceneIndex() {
        return currentSceneIndex;
    }

    /**
     *
     **/
    public void setCurrentSceneIndex(int currentSceneIndex_) {
        currentSceneIndex = currentSceneIndex_;
    }

}