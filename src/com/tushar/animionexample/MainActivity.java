package com.tushar.animionexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView iv;
	Animation an,an1,an2,an3;
	Button bt,bt1,bt2,bt3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      bt = (Button)findViewById(R.id.button1);
      iv = (ImageView) findViewById(R.id.imageView1);
      iv.setImageResource(R.drawable.ang1);
      bt1 = (Button)findViewById(R.id.button2);
      bt2 = (Button)findViewById(R.id.button3);
      bt3 = (Button)findViewById(R.id.button4);
      
      
      an = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
      
      
      an1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
      an2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
      an3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
      
      
      bt.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			iv.startAnimation(an);
		}
	} );
      
      
      bt1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			iv.startAnimation(an1);
		}
	});
      bt2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			iv.startAnimation(an2);
		}
	});
      bt3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			iv.startAnimation(an3);
		}
	});
      
     
      }
    
 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



	
    
}

