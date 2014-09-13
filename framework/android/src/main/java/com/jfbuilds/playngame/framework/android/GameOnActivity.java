package com.jfbuilds.playngame.framework.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.jfbuilds.playngame.framework.core.GameOn;

public class GameOnActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new Zankie());
  }
}
