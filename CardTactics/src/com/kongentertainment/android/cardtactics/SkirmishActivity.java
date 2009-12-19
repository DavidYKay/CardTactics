package com.kongentertainment.android.cardtactics;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SkirmishActivity extends GameActivity {

  //
  // Fields
  //
	
  
  //
  // Constructors
	//
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        // No Title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		
        final Window win = getWindow(); 
        // No Statusbar
        win.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);     

		setContentView(R.layout.gameview_layout);
		//setContentView(R.layout.main);
		
		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			//taxPercent = bundle.getDouble("com.jvdk.stb.taxPercent");
			gameMode = bundle.getInt("com.kongentertainment.android.cardtactics.gamemode");
			//userName = bundle.getString("userName");
		}
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
