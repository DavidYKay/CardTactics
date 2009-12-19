package com.kongentertainment.android.cardtactics;

import android.app.Activity;
import android.os.Bundle;

/**
 * Our main activity. This guy is boss and is mainly responsible for managing lifecycle.
 * @author dk
 *
 */
public class CardTactics extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}