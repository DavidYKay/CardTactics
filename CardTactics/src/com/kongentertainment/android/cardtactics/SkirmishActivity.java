package com.kongentertainment.android.cardtactics;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.kongentertainment.android.cardtactics.view.GameView;
import com.kongentertainment.android.cardtactics.view.GameView.GameViewThread;

public class SkirmishActivity extends GameActivity {
	public class GameThread extends Thread {

	}

  //
  // Fields
  //
	private GameView mGameView;
	private GameViewThread mGameViewThread;
	
    //
    // Constructors
    //
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			//taxPercent = bundle.getDouble("com.jvdk.stb.taxPercent");
			gameMode = bundle.getInt("com.kongentertainment.android.cardtactics.gamemode");
			//userName = bundle.getString("userName");
		}

        // No Title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		
        final Window win = getWindow(); 
        // No Status bar
        win.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);     

        setContentView(R.layout.gameview_layout);
        // get handles to the GameView from XML, and its GameViewThread
        mGameView = (GameView) findViewById(R.id.gameView);
        mGameViewThread = mGameView.getThread();
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	}

    //
    // Methods
    //

    //
    // Accessor methods
    //

    //
    // Other methods
    //

}
