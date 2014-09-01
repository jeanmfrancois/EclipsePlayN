package com.jfbuilds.playngame.framework.core;

import static playn.core.PlayN.*;

//import com.jfbuilds.playngame.utils.GenerateCode;

import playn.core.CanvasImage;
import playn.core.Font;
import playn.core.Game;
import playn.core.GroupLayer;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.Layer;
import playn.core.TextFormat;
import playn.core.TextLayout;


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

		GroupLayer base = graphics().createGroupLayer();
		graphics().rootLayer().add(base);

		// draw a soothing flat background
		CanvasImage bgtile = graphics().createImage(64, 64);
		bgtile.canvas().setFillColor(0xFFCCCCCC);
		bgtile.canvas().fillRect(0, 0, 64, 64);
		bgtile.canvas().setStrokeColor(0xFFFFFFFF);
		bgtile.canvas().strokeRect(0, 0, 64, 64);
		bgtile.setRepeat(true, true);

		ImageLayer bg = graphics().createImageLayer(bgtile);
		bg.setWidth(graphics().width());
		bg.setHeight(graphics().height());
		base.add(bg);

		// add some text to said soothing background
		final float MARGIN = 10;
		float xpos = MARGIN, maxYPos = 0;
		for (String name : new String[] { "Helvetica", "Museo-300" }) {
			float ypos = MARGIN, maxWidth = 0;
			for (Font.Style style : Font.Style.values()) {
				for (float size : new float[] { 12f, 24f, 32f }) {
					Font font = graphics().createFont(name, style, size);
					TextFormat format = new TextFormat().withFont(font);
					TextLayout layout = graphics().layoutText(
							"Hello JF Builds PlayN World", format);
					Layer layer = createTextLayer(layout, 0xFF000000);
					layer.setTranslation(xpos, ypos);
					base.add(layer);
					ypos += layout.height();
					maxWidth = Math.max(maxWidth, layout.width());
					maxYPos = Math.max(ypos, maxYPos);
				}
			}
			xpos += (maxWidth + MARGIN);
		}

		// GenerateCode.sampleInit();
	}

	protected Layer createTextLayer(TextLayout layout, int color) {
		CanvasImage image = graphics().createImage(
				(int) Math.ceil(layout.width()),
				(int) Math.ceil(layout.height()));
		image.canvas().setFillColor(color);
		image.canvas().fillText(layout, 0, 0);
		return graphics().createImageLayer(image);
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
