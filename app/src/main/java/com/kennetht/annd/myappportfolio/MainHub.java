package com.kennetht.annd.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainHub extends AppCompatActivity {

    private Toast displayedToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);
    }


    public void createToast(View view) {
        Button CurButton = (Button)view;
       // int buttonID = CurButton.getId();
        CharSequence displayedToastMessage = CurButton.getText().toString();
        int duration = Toast.LENGTH_SHORT;

        /*
        switch(buttonID) {
            case R.id.Popular_Movies_App:
                displayedToastMessage = CurButton.getText().toString();
                break;
            case R.id.Scores_App:
                displayedToastMessage = CurButton.getText().toString();
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
        */

        if(displayedToast != null) {
            displayedToast.cancel();
        }

        displayedToast = Toast.makeText(getApplicationContext(), displayedToastMessage, duration);
        displayedToast.show();
    }
}
