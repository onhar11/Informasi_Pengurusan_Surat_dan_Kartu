package com.KAMIBEREMPAT.pengurusansuratdankartu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class SyaratSIM extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.syarat_sim);
		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent(this,SyaratSIM.class));
		}
		return super.onOptionsItemSelected(item);
		
	}

	
}
