package com.kongentertainment.android.cardtactics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Our main activity. This guy is boss and is mainly responsible for managing application lifecycle.
 * @author dk
 *
 */
public class CardTactics extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setContentView(R.layout.mainmenu);

		final Button skirmishButton = (Button)this.findViewById(R.id.mainmenu_SkirmishButton);
		final Button onlineButton   = (Button)this.findViewById(R.id.mainmenu_OnlineButton);
		final Button settingsButton  = (Button)this.findViewById(R.id.mainmenu_SettingsButton);
        skirmishButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		Intent myIntent = new Intent(CardTactics.this, SkirmishActivity.class);
        		Bundle bundle = new Bundle();
        		//Pass the relevant mode to GameClient
        		bundle.putInt("com.kongentertainment.android.cardtactics.gamemode", 1);
        		myIntent.putExtras(bundle);
        		CardTactics.this.startActivity(myIntent);
        		/*
        		parseFields();        	
        		Intent myIntent = new Intent(mainmenu_this, PersonScreen.class);
        		Bundle bundle = new Bundle();
        		bundle.putDouble("com.jvdk.stb.taxPercent", taxPercent);
        		bundle.putDouble("com.jvdk.stb.tipPercent", tipPercent);
        		bundle.putString("com.jvdk.stb.userName", userName);
        		myIntent.putExtras(bundle);
        		mainmenu_this.startActivity(myIntent);
        		*/
        	}        	
        });
        onlineButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		Intent myIntent = new Intent(CardTactics.this, OnlineActivity.class);
//        		Bundle bundle = new Bundle();
//        		//Pass the relevant mode to GameClient
//        		bundle.putInt("com.kongentertainment.android.cardtactics.gamemode", 1);
//        		myIntent.putExtras(bundle);
        		CardTactics.this.startActivity(myIntent);        		
        	}        	
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		Intent myIntent = new Intent(CardTactics.this, SettingsActivity.class);
        		//Bundle bundle = new Bundle();
        		//Pass the relevant mode to GameClient
        		//bundle.putInt("com.kongentertainment.android.cardtactics.gamemode", 1);
        		//myIntent.putExtras(bundle);
        		CardTactics.this.startActivity(myIntent);        		
        	}        	
        });
    }
}
