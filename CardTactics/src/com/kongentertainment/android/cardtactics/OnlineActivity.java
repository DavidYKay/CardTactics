package com.kongentertainment.android.cardtactics;

import android.os.Bundle;
import android.widget.TextView;

public class OnlineActivity extends GameActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.gameview_layout);
		setContentView(R.layout.main);
	
		TextView welcomeText = (TextView)this.findViewById(R.id.helloTextView);
		welcomeText.setText(R.string.online);

		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			//taxPercent = bundle.getDouble("com.jvdk.stb.taxPercent");
			gameMode = bundle.getInt("com.kongentertainment.android.cardtactics.gamemode");
			//userName = bundle.getString("userName");
		}
	}
}
