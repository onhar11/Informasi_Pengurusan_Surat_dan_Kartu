package com.KAMIBEREMPAT.pengurusanKartu;

import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratKartuKuning;
import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapKartuKuning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class KartuKuning extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kartu_kuning);
		getActionBar().setDisplayHomeAsUpEnabled(true);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kartu_kuning, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_syaratkuning) {
			syaratkuning();
			return true;
		}
		if (id == R.id.action_tahapkuning){
			tahapkuning();
			return true;
		}
		switch (item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this,  new Intent(this,KartuKuning.class));
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void syaratkuning() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratKartuKuning.class);
		startActivity(i);
	}
	private void tahapkuning() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapKartuKuning.class);
		startActivity(i);
	}
}

