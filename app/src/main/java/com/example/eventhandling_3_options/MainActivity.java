package com.example.eventhandling_3_options;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.myButton);

        // option 1:
//        btn.setOnClickListener(new Click());

        // option 2:
//        btn.setOnClickListener(myListener);

        // option 3:
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView myTextViewInstance = (TextView) findViewById(R.id.txtMytext);
                myTextViewInstance.setText("Hi from inline (option 3)");
            }
        });

        Log.i("TAG1", "this is onCreate");

    }

    // option 1:
//    private class Click implements View.OnClickListener{

    // option 2:
    // TODO: dead code if using option 3: creating that instance inline
//    private View.OnClickListener myListener = new View.OnClickListener(){
//        @Override
//        public void onClick(View v){
//            Log.i("TAG1", "this is onClick");
//
//            TextView myTextViewInstance = (TextView) findViewById(R.id.txtMytext);
//            myTextViewInstance.setText("Through click");
//        }
//    };

    public void onPressed(View v){
        Log.i("TAG1", "Pressed");
        TextView myTextViewInstance = (TextView) findViewById(R.id.txtMytext);
        myTextViewInstance.setText("Hello Class!");
    }
}