package com.example.hellounittest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText et1; 
    private EditText et2;
    private Button btn1; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1); 
        et2 = (EditText)findViewById(R.id.et2);
        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
            	
            	//Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            	//startActivityForResult(intent, 100);

                String s = et1.getText().toString();
                s = addHello(s);
                et2.setText(s);
            }
       });		
	}

    public String addHello(String s) {
        return "Hello, " + s + "!";
    }	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
