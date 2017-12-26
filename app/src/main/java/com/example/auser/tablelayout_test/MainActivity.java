package com.example.auser.tablelayout_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        TableLayout tt=new TableLayout(this);
        setContentView(tt);

        TableRow[] tr=new TableRow[10];
        TextView tv[]=new TextView[10];
        Button bt[]=new Button[10];
        for (int i=0;i<tr.length;i++){
            tr[i]=new TableRow(this);
            tv[i]=new TextView(this);
            tv[i].setText("No: " + i);
            bt[i]=new Button(this);
            bt[i].setText("No: "+i);
            tr[i].addView(tv[i]);
            tr[i].addView(bt[i]);
            tt.addView(tr[i]);
        }
    }
}
