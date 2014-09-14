package com.jfbuilds.playngame.framework.core;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;
import playn.core.Image;
import playn.core.ImageLayer;

import com.jfbuilds.playngame.general.SimpleGame;

public class GameOn extends SimpleGame {

	public GameOn() {
		super(33); // call update every 33ms (30 times per second)
	}

	@Override
	public void init() {
		// create and add background image layer
		Image bgImage = assets().getImage("images/bg.png");
		ImageLayer bgLayer = graphics().createImageLayer(bgImage);
		graphics().rootLayer().add(bgLayer);

		System.out.print("Output: ");

		// JFBContainerCollection col = new JFBContainerCollection("Jean");
		// ArrayList<JFBContainerCollection> myFamily = col.getFamily();
		// for (Iterator iterator = myFamily.iterator(); iterator.hasNext();) {
		// JFBContainerCollection jfbContainerCollection =
		// (JFBContainerCollection) iterator.next();
		// System.out.println(jfbContainerCollection.getName());
		// }

		// for (int i = 0; i <
		// JFBContainerCollectionInterface.FragmentType.values().length; i++) {
		// System.out.println("Type:" +
		// JFBContainerCollectionInterface.FragmentType.values()[i].name() +
		// " - Allow Multiple: " +
		// JFBContainerCollectionInterface.FragmentType.values()[i].multipleAllowed());
		// }

		// GenerateCode.sampleInit();
	}

	@Override
	public void paint(float alpha) {
		// the background automatically paints itself, so no need to do anything
		// here!
	}

	@Override
	public void update(int delta) {
	}
}
