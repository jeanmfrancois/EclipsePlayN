/* Generated by Quick UML for Java */

package com.jfbuilds.playngame.objectives;

/**
 *
 **/
public interface JFBObjectiveInterface {

    /* ===================================== */
    /* ==         Member Variables        == */
    /* ===================================== */

    private boolean activated;

    private int value;

    private int steps;

    private int incrementalValue;

    private JFBConditionInterface condition;

    private JFBStatusInterface status;

    private JFBActionInterface incrementalAction;

    private JFBActionInterface goalAction;

    private JFBResetInterface reset;

    private JFBEventBindsInterface eventBinds;

    /* ===================================== */
    /* ==         Methods                 == */
    /* ===================================== */

    /**
     *
     **/
    public boolean isActivated() {
        return activated;
    }

    /**
     *
     **/
    public void setActivated(boolean activated_) {
        activated = activated_;
    }

    /**
     *
     **/
    public int getValue() {
        return value;
    }

    /**
     *
     **/
    public void setValue(int value_) {
        value = value_;
    }

    /**
     *
     **/
    public int getSteps() {
        return steps;
    }

    /**
     *
     **/
    public void setSteps(int steps_) {
        steps = steps_;
    }

    /**
     *
     **/
    public int getIncrementalValue() {
        return incrementalValue;
    }

    /**
     *
     **/
    public void setIncrementalValue(int incrementalValue_) {
        incrementalValue = incrementalValue_;
    }

    /**
     *
     **/
    public JFBConditionInterface getCondition() {
        return condition;
    }

    /**
     *
     **/
    public void setCondition(JFBConditionInterface condition_) {
        condition = condition_;
    }

    /**
     *
     **/
    public JFBStatusInterface getStatus() {
        return status;
    }

    /**
     *
     **/
    public void setStatus(JFBStatusInterface status_) {
        status = status_;
    }

    /**
     *
     **/
    public JFBActionInterface getIncrementalAction() {
        return incrementalAction;
    }

    /**
     *
     **/
    public void setIncrementalAction(JFBActionInterface incrementalAction_) {
        incrementalAction = incrementalAction_;
    }

    /**
     *
     **/
    public JFBActionInterface getGoalAction() {
        return goalAction;
    }

    /**
     *
     **/
    public void setGoalAction(JFBActionInterface goalAction_) {
        goalAction = goalAction_;
    }

    /**
     *
     **/
    public JFBResetInterface getReset() {
        return reset;
    }

    /**
     *
     **/
    public void setReset(JFBResetInterface reset_) {
        reset = reset_;
    }

    /**
     *
     **/
    public JFBEventBindsInterface getEventBinds() {
        return eventBinds;
    }

    /**
     *
     **/
    public void setEventBinds(JFBEventBindsInterface eventBinds_) {
        eventBinds = eventBinds_;
    }

    /**
     *
     **/
    public boolean isObjectiveCandidate(JFBObjectiveInterface candidate) {

    }

}