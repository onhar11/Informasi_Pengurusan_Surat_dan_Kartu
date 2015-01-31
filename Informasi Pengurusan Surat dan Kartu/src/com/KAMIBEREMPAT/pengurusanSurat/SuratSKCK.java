package com.KAMIBEREMPAT.pengurusanSurat;

import com.KAMIBEREMPAT.pengurusansuratdankartu.R;
import com.KAMIBEREMPAT.pengurusansuratdankartu.SyaratSKCK;
import com.KAMIBEREMPAT.pengurusansuratdankartu.TahapSKCK;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class SuratSKCK extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_surat_skck);
		getActionBar().setDisplayShowHomeEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.surat_skck, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_syaratskck) {
			syaratskck();
			return true;
		}
		if (id == R.id.action_tahapskck){
			tahapskck();
			return true;
		}
		
		switch(item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent(this,SuratSKCK.class));
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	private void syaratskck() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),SyaratSKCK.class);
		startActivity(i);
	}
	private void tahapskck() {
		// TODO Auto-generated method stub
		Intent i = new Intent (getApplicationContext(),TahapSKCK.class);
		startActivity(i);
	}
}


