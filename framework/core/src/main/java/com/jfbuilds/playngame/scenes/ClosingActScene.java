package com.jfbuilds.playngame.scenes;

import com.jfbuilds.playngame.general.JFBContainerInterface;

public class ClosingActScene extends SimpleScene implements JFBContainerInterface, JFBSceneInterface {

	public ClosingActScene(String name_, JFBContainerInterface parent_) {
		super(name_, parent_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void create() {
		this.addImageLayer("images/closing_act.png");
	}

}
