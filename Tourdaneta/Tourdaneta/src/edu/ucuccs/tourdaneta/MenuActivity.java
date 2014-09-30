package edu.ucuccs.tourdaneta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends Activity {
ImageView Home;	
ImageView Map;	
ImageView AS;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
        Home=(ImageView)findViewById(R.id.image1);
        Home.setOnClickListener(new View.OnClickListener()
        {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub 
				Intent i = new Intent(MenuActivity.this,HomeActivity.class);
				startActivity(i);
			}
			
			
				
			});

        Map=(ImageView)findViewById(R.id.image2);
        Map.setOnClickListener(new View.OnClickListener()
        {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MenuActivity.this,MapActivity.class);
				startActivity(i);
			}
		
        
	});
        AS=(ImageView)findViewById(R.id.image3);
        AS.setOnClickListener(new View.OnClickListener()
        {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MenuActivity.this,ASActivity.class);
				startActivity(i);
			}
	

});
	}
}