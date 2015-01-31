package com.KAMIBEREMPAT.pengurusanSurat;

import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratSuratTanah;
import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapTanah;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class SuratTanah extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_surat_tanah);
		getActionBar().setDisplayShowHomeEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.surat_tanah, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_syarattanah) {
			syarattanah();
			return true;
		}
		if (id == R.id.action_tahaptanah){
			tahaptanah();
			return true;
		}
		
		switch(item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent(this,SuratTanah.class));
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	private void syarattanah() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratSuratTanah.class);
		startActivity(i);
	}
	private void tahaptanah() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapTanah.class);
		startActivity(i);
	}
}


