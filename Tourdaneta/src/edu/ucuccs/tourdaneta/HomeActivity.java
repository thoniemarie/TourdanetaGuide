package edu.ucuccs.tourdaneta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends Activity {
ImageView Hymn;
ImageView History;
ImageView Facts;
ImageView Illu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	

	Hymn=(ImageView)findViewById(R.id.image1);
    Hymn.setOnClickListener(new View.OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(HomeActivity.this,HymnActivity.class);
			startActivity(i);
		}



});
    
    History=(ImageView)findViewById(R.id.image2);
    History.setOnClickListener(new View.OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(HomeActivity.this,HistoryActivity.class);
			startActivity(i);
			
		}
});
    
    Facts=(ImageView)findViewById(R.id.image3);
    Facts.setOnClickListener(new View.OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(HomeActivity.this,FactsActivity.class);
			startActivity(i);
		}
	});

    Illu=(ImageView)findViewById(R.id.image4);
    Illu.setOnClickListener(new View.OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(HomeActivity.this,IlluActivity.class);
			startActivity(i);
		}
		});
	}
}

