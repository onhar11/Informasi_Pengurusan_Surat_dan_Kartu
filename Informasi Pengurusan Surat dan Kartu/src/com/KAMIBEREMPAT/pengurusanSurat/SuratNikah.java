package com.KAMIBEREMPAT.pengurusanSurat;

import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratSuratNikah;
import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapanSuratNikah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class SuratNikah extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_surat_nikah1);
		getActionBar().setDisplayShowHomeEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.surat_nikah, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_Syarat) {
			syarat();
			return true;
		}
		if (id == R.id.action_Tahap){
			tahapan();
			return true;
		}
		switch(item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent(this,SuratNikah.class));
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	private void tahapan() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapanSuratNikah.class);
		startActivity(i);
	}
	private void syarat() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratSuratNikah.class);
		startActivity(i);
	}
}
