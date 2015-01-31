package com.KAMIBEREMPAT.pengurusanKartu;

import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratSIM;
import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapSim;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class Sim extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sim);
		getActionBar().setDisplayHomeAsUpEnabled(true)
;	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sim, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_syaratsim) {
			syaratsim();
			return true;
		}
		if (id == R.id.action_tahapsim){
			tahapsim();
			return true;
		}
		switch (item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent (this,Sim.class) );
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void syaratsim() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratSIM.class);
		startActivity(i);
	}
	private void tahapsim() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapSim.class);
		startActivity(i);
	}
}


