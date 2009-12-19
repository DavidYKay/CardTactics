package com.kongentertainment.android.cardtactics;

import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.gameview_layout);
		setContentView(R.layout.settings_layout);
		

		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			//taxPercent = bundle.getDouble("com.jvdk.stb.taxPercent");
			//gameMode = bundle.getInt("com.kongentertainment.android.cardtactics.gamemode");
			//userName = bundle.getString("userName");
		}
	}
}
