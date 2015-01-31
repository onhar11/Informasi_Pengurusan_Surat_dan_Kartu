package com.KAMIBEREMPAT.pengurusanKartu;


import com.KAMIBEREMPAT.pengurusansuratdankartu.PengurusanKartu;
import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratBPJS;

import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapBpjs;

import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;



public class Bpjs extends Activity{
	
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_bpjs);
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	    
}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bpjs, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_syaratbpjs) {
			syaratbpjs();
			return true;
		}
		if (id == R.id.action_tahapbpjs){
			tahapbpjs();
			return true;
		}
		
		switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	    	NavUtils.navigateUpTo(this,
	 new Intent(this, Bpjs.class));

	        return true;
	    }
		return super.onOptionsItemSelected(item);
	}
	
	private void syaratbpjs() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratBPJS.class);
		startActivity(i);
	}
	private void tahapbpjs() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapBpjs.class);
		startActivity(i);
	}
}

