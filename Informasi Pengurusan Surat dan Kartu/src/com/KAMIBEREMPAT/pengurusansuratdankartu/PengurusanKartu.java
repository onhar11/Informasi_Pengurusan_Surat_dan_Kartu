package com.KAMIBEREMPAT.pengurusansuratdankartu;


import com.KAMIBEREMPAT.pengurusanKartu.Bpjs;
import com.KAMIBEREMPAT.pengurusanKartu.Ektp;
import com.KAMIBEREMPAT.pengurusanKartu.KartuKeluarga;
import com.KAMIBEREMPAT.pengurusanKartu.KartuKuning;
import com.KAMIBEREMPAT.pengurusanKartu.Sim;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;

public class PengurusanKartu extends Activity{
	
	
	ListView list;
	String[] web = {
		"BPJS Kesehatan",
			"e-Kartu Tanda Penduduk",
			"Surat Izin Mengemudi",
			"Kartu Kuning",
			"Kartu Keluarga",
			
			
	} ;
	Integer[] imageId = {
			R.drawable.abbpjs,
			R.drawable.abektp,
			R.drawable.absim,
			R.drawable.abkuning,
			R.drawable.abkeluarga,
			
			
			
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pengurusan_kartu);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		
		CustomList adapter = new
				CustomList(PengurusanKartu.this, web, imageId);
		list=(ListView)findViewById(R.id.list);
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                

		          
					switch(position)
					{
					
					case 0:
					//intent ke kelas Bpjs
					Intent pos =new Intent(getApplicationContext(),Bpjs.class);
					startActivity(pos);
					Toast.makeText(PengurusanKartu.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 1:
					//intent ke kelas Ektp
					Intent ektp =new Intent(getApplicationContext(),Ektp.class);
					startActivity(ektp);
					Toast.makeText(PengurusanKartu.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 2:
					//intent ke kelas sim
					Intent kar =new Intent(getApplicationContext(),Sim.class);
					startActivity(kar);
					Toast.makeText(PengurusanKartu.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 3:
					//intent ke kelas kartu kuning
					Intent sim =new Intent(getApplicationContext(),KartuKuning.class);
					startActivity(sim);
					Toast.makeText(PengurusanKartu.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 4:
					//intent ke kelas Kartu keluarga
					Intent kk =new Intent(getApplicationContext(),KartuKeluarga.class);
					startActivity(kk);
					Toast.makeText(PengurusanKartu.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					}
	       
             
            }
           });

			


       }
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	    	NavUtils.navigateUpTo(this,
	 new Intent(this, PengurusanKartu.class));

	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
}