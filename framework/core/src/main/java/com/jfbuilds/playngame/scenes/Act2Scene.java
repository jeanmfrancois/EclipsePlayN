package com.jfbuilds.playngame.scenes;

import com.jfbuilds.playngame.general.JFBContainerInterface;

public class Act2Scene extends SimpleScene implements JFBContainerInterface, JFBSceneInterface {

	public Act2Scene(String name_, JFBContainerInterface parent_) {
		super(name_, parent_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		this.addImageLayer("images/act_2.png");
	}

}
