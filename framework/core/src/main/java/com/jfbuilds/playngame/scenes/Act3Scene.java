package com.jfbuilds.playngame.scenes;

import com.jfbuilds.playngame.general.JFBContainerInterface;

public class Act3Scene extends SimpleScene implements JFBContainerInterface, JFBSceneInterface {

	public Act3Scene(String name_, JFBContainerInterface parent_) {
		super(name_, parent_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void create() {
		this.addImageLayer("images/act_3.png");
	}

}
