/**
 *
 */
package com.jfbuilds.playngame.scenes;

import com.jfbuilds.playngame.general.JFBContainerInterface;

/**
 * @author Jean
 *
 */
public class SimpleScene extends JFBAbstractScene implements JFBSceneInterface {
	public SimpleScene(String name_, JFBContainerInterface parent_) {
		setName(name_);
		setParent(parent_);
		init();
	}

	@Override
	public void create() {
		this.addImageLayer("images/bg.png");
	}
}
