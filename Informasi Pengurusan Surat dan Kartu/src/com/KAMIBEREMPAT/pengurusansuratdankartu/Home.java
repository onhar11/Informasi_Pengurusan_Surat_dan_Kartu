package com.KAMIBEREMPAT.pengurusansuratdankartu;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar;

@SuppressLint("InflateParams") public class Home extends Activity {

	ImageButton imageButton;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        ActionBar mActionBar = getActionBar();
        
		mActionBar.setDisplayShowHomeEnabled(false);
		mActionBar.setDisplayShowTitleEnabled(false);
		LayoutInflater mInflater = LayoutInflater.from(this);

		View mCustomView = mInflater.inflate(R.layout.action_bar,null);
		TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
		mTitleTextView.setText("Informasi Pengurusan Surat dan Kartu");

		ImageButton imageButton = (ImageButton) mCustomView
				.findViewById(R.id.imageButton);
		imageButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				Toast.makeText(getApplicationContext(), "Refresh Clicked!",
						Toast.LENGTH_LONG).show();
			}
		});

		mActionBar.setCustomView(mCustomView);
		mActionBar.setDisplayShowCustomEnabled(true);
		
	}
  
    



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	int id = item.getItemId();
    	if (id == R.id.action_Tentang){
			
			Tentang();
			return true;
    	}
		if (id == R.id.action_Keluar){
			openKeluar();
			return true;
		}
		return super.onOptionsItemSelected(item);
	
    }
    private void openKeluar() {
		// TODO Auto-generated method stub
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
		 builder.setMessage("Apakah Anda Yakin Ingin Keluar?")
        .setCancelable(false)
        .setPositiveButton("Ya",
        new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog,
        int id) {
       Home.this.finish();
        }
        })
        .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog,
        int id) {
        dialog.cancel();

        }
        }).show();
	}


	private void Tentang() {
		// TODO Auto-generated method stub
	 
	    	Intent Kamiberempat = new Intent (getApplicationContext(),TentangActivity.class);
	    	startActivity(Kamiberempat);
	

	}
	
    public void PengurusanSurat (View v){
    	Intent Kamiberempat = new Intent (getApplicationContext(),PengurusanSurat.class);
    	startActivity(Kamiberempat);
    }
    
    public void PengurusanKartu (View v){
    	Intent Kamiberempat = new Intent (getApplicationContext(),PengurusanKartu.class);
    	startActivity(Kamiberempat);
    }
   
}


