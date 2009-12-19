package com.kongentertainment.android.cardtactics;

import android.app.Activity;
import android.os.Bundle;

public class SkirmishActivity extends Activity {

  //
  // Fields
  //
	private int gameMode;
  
  //
  // Constructors
	//
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.gameview_layout);
		setContentView(R.layout.main);
		

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
