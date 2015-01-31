package com.KAMIBEREMPAT.pengurusansuratdankartu;


import java.security.PublicKey;

import com.KAMIBEREMPAT.pengurusanSurat.SKBN;
import com.KAMIBEREMPAT.pengurusanSurat.SuratNikah;
import com.KAMIBEREMPAT.pengurusanSurat.SuratSKCK;
import com.KAMIBEREMPAT.pengurusanSurat.SuratTanah;
import com.KAMIBEREMPAT.pengurusanSurat.SuratWarisan;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class PengurusanSurat extends Activity{
	
	
	ListView list;
	String[] web = {
		"Surat Nikah",
			"Surat Tanah",
			"Surat Warisan",
			"SKCK",
			"SKBN",
			
			
	} ;
	Integer[] imageId = {
			R.drawable.abnikah,
			R.drawable.abbpn,
			R.drawable.abwarisan,
			R.drawable.abskck,
			R.drawable.abbnn,
			
			
			
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pengurusan_kartu);
		
		 getActionBar().setDisplayHomeAsUpEnabled(true);
		
		CustomList adapter = new
				CustomList(PengurusanSurat.this, web, imageId);
		list=(ListView)findViewById(R.id.list);
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                

		          
					switch(position)
					{
					
					case 0:
					//intent ke kelasSuratNikah
					Intent pos =new Intent(getApplicationContext(),SuratNikah.class);
					startActivity(pos);
					Toast.makeText(PengurusanSurat.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 1:
					//intent ke kelas SuratTanah
					Intent ektp =new Intent(getApplicationContext(),SuratTanah.class);
					startActivity(ektp);
					Toast.makeText(PengurusanSurat.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 2:
					//intent ke kelas SuratWarisan
					Intent kar =new Intent(getApplicationContext(),SuratWarisan.class);
					startActivity(kar);
					Toast.makeText(PengurusanSurat.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 3:
					//intent ke kelas SuratSKCK
					Intent sim =new Intent(getApplicationContext(),SuratSKCK.class);
					startActivity(sim);
					Toast.makeText(PengurusanSurat.this,
							"Anda Menuju ke halaman " +web[+ position], Toast.LENGTH_SHORT).show();
					break;
					case 4:
					//intent ke kelas  SKBN
					Intent kk =new Intent(getApplicationContext(),SKBN.class);
					startActivity(kk);
					Toast.makeText(PengurusanSurat.this,
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
	 new Intent(this, PengurusanSurat.class));

	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
}


