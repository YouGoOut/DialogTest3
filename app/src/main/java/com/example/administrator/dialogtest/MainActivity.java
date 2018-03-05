package com.example.administrator.dialogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                MyDialog myDialog=new MyDialog(MainActivity.this);
                myDialog.setDialogCallback(dialogcallback);
                myDialog.show();
            }
        });

    }

    MyDialog.Dialogcallback dialogcallback=new MyDialog.Dialogcallback() {
        @Override
        public void dialogdo(String string) {
            tv.setText(string);
        }
    };
}