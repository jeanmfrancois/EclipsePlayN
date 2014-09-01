package com.jfbuids.playngame.framework.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.jfbuids.playngame.framework.core.GameOn;

public class GameOnJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    PlayN.run(new GameOn());
  }
}
