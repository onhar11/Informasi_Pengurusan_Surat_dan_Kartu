package com.KAMIBEREMPAT.pengurusansuratdankartu;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;

public class TentangActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tentang);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	   }
	   
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	    	NavUtils.navigateUpTo(this,
	 new Intent(this, TentangActivity.class));

	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
	}