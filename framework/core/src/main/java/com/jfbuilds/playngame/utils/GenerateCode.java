package com.jfbuilds.playngame.utils;

import static playn.core.PlayN.graphics;
import playn.core.CanvasImage;
import playn.core.Font;
import playn.core.GroupLayer;
import playn.core.ImageLayer;
import playn.core.Layer;
import playn.core.TextFormat;
import playn.core.TextLayout;

public class GenerateCode {
	protected static Layer createTextLayer(TextLayout layout, int color) {
		CanvasImage image = graphics().createImage((int) Math.ceil(layout.width()), (int) Math.ceil(layout.height()));
		image.canvas().setFillColor(color);
		image.canvas().fillText(layout, 0, 0);
		return graphics().createImageLayer(image);
	}

	public static void performAction() {
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
					TextLayout layout = graphics().layoutText("Hello JF Builds PlayN World", format);
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

		System.out.print("Test Complete");
	}

	public static void sampleInit() {
		performAction();
	}

}
