package com.jfbuids.playngame.framework.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.jfbuids.playngame.framework.core.GameOn;

public class GameOnActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new GameOn());
  }
}
