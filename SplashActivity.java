package com.nbeport.aprilbeaconpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.splash);
	        Handler x = new Handler();
	        x.postDelayed(new splashhandler(), 3000);
	        
	}
	class splashhandler implements Runnable{
	        public void run() {
	        	
	            startActivity(new Intent(getApplication(),MainActivity.class));
	            SplashActivity.this.finish();
	        }
	}
	
}
