package com.jfbuilds.playngame.scenes;

import com.jfbuilds.playngame.general.JFBContainerInterface;

public class Act5Scene extends SimpleScene implements JFBContainerInterface, JFBSceneInterface {

	public Act5Scene(String name_, JFBContainerInterface parent_) {
		super(name_, parent_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void create() {
		this.addImageLayer("images/act_5.png");
	}

}
