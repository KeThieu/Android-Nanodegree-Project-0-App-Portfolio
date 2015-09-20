package com.kennetht.annd.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainHub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_hub, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createToast(View view) {
        Button CurButton = (Button)view;
        int buttonID = CurButton.getId();
        CharSequence displayedToastMessage;
        int duration = Toast.LENGTH_SHORT;
        switch(buttonID) {
            case R.id.Popular_Movies_App:
                displayedToastMessage = "This button will launch the Popular Movies App.";
                break;
            case R.id.Scores_App:
                displayedToastMessage = "This button will launch the FootBall Scores App.";
                break;
            case R.id.Library_App:
                displayedToastMessage = "This button will launch the Library App.";
                break;
            case R.id.Build_It_Bigger_App:
                displayedToastMessage = "This button will launch the Build It Bigger App.";
                break;
            case R.id.XYZ_App:
                displayedToastMessage = "This button will launch the XYZ Reader App.";
                break;
            case R.id.Capstone_App:
                displayedToastMessage = "This button will launch the Capstone Project.";
                break;
            default:
                displayedToastMessage = "No button was pressed.";
                break;
        }

        Toast displayedToast = Toast.makeText(getApplicationContext(), displayedToastMessage, duration);
        displayedToast.show();
    }
}
