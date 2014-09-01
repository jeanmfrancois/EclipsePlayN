package com.jfbuilds.playngame.framework.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.jfbuilds.playngame.framework.core.GameOn;

public class GameOnHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform platform = HtmlPlatform.register(config);
    platform.assets().setPathPrefix("framework/");
    PlayN.run(new GameOn());
  }
}
