package com.jfbuilds.playngame.framework.core;

import static playn.core.PlayN.*;

import com.jfbuilds.playngame.utils.GenerateCode;


import playn.core.Game;

import playn.core.Image;
import playn.core.ImageLayer;


public class GameOn extends Game.Default {

	public GameOn() {
		super(33); // call update every 33ms (30 times per second)
	}

	@Override
	public void init() {
		// create and add background image layer
		Image bgImage = assets().getImage("images/bg.png");
		ImageLayer bgLayer = graphics().createImageLayer(bgImage);
		graphics().rootLayer().add(bgLayer);

		

		GenerateCode.sampleInit();
	}

	

	@Override
	public void update(int delta) {
	}

	@Override
	public void paint(float alpha) {
		// the background automatically paints itself, so no need to do anything
		// here!
	}
}