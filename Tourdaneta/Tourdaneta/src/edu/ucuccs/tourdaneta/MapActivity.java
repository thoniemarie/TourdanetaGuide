package edu.ucuccs.tourdaneta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MapActivity extends Activity {
	ImageView market;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		market=(ImageView)findViewById(R.id.image1);
        market.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				Intent i = new Intent(MapActivity.this,Market.class);
				startActivity(i);
			}
	});

	}	
}