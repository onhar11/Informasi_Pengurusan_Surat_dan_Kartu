package com.KAMIBEREMPAT.pengurusanSurat;

import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratSkbn;
import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapSKBN;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class SKBN extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_skbn);
		getActionBar().setDisplayShowHomeEnabled(true);
		
	
	

		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.skbn, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_syaratskbn) {
			syaratskbn();
			return true;
		}
		if (id == R.id.action_tahapskbn){
			tahapskbn();
			return true;
		}
		switch(item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent(this,SKBN.class));
			
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void syaratskbn() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratSkbn.class);
		startActivity(i);
	}
	private void tahapskbn() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapSKBN.class);
		startActivity(i);
	}
}


	
	
	

