package interfacedesign.ligo.michael.ligoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import interfacedesign.ligo.michael.ligoapp.activities.Activity1;
import interfacedesign.ligo.michael.ligoapp.activities.Activity2;
import interfacedesign.ligo.michael.ligoapp.activities.Activity3;
import interfacedesign.ligo.michael.ligoapp.activities.Activity4;

/**
 * Created by Mike on 2/27/16.
 */
public class MainActivity extends ActionBarActivity{

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;




    @Override
   public  void onCreate(Bundle savedInstanceState){

       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent2);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent3);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4 = new Intent(MainActivity.this, Activity4.class);
                startActivity(intent4);

            }
        });

    }

}
