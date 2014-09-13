package com.jfbuilds.playngame.framework.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.jfbuilds.playngame.framework.core.GameOn;
import com.jfbuilds.playngame.general.Zankie;

public class GameOnJava {

  public static void main(String[] args) {
	  
	
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    
    JavaPlatform.register(config);
    PlayN.run(new Zankie());
  }
}
