package com.team.flipagain.gui.mainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.team.flipagain.R;
import com.team.flipagain.application.ApplicationManager;
import com.team.flipagain.gui.login.LoginActivity;
import com.team.flipagain.gui.mainScreen.cardCreator.CardCreatorActivity;
import com.team.flipagain.gui.mainScreen.cardGetter.CardGetterActivity;
import com.team.flipagain.gui.mainScreen.cardScreen.CardOverviewActivity;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Button Listener to CardOverviewActivity
        Button savedBundles = (Button) findViewById(R.id.mainScreen_btn_startLearning);
        savedBundles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CardOverviewActivity.class);
                intent.putExtra("case", 1);
                startActivity(intent);
            }
        });

        // Button Listener to Create Cards Activity
        Button createCards = (Button) findViewById(R.id.mainScreen_btn_cardCreator);
        createCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CardCreatorActivity.class);
                intent.putExtra("nameOfBundle", "start");
                startActivity(intent);
            }
        });

        // Button Listener to Get Cards Activity
        Button getCards = (Button) findViewById(R.id.mainScreen_btn_getNewCards);
        getCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CardGetterActivity.class);
                startActivity(intent);
            }
        });

     /*   ApplicationManager ap = new ApplicationManager();
        if(ap.getUser(savedBundles.getContext()) == null){
            createCards.setEnabled(false);
            getCards.setEnabled(false);
        }*/



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainScreenActivity.this, LoginActivity.class);
        startActivity(intent);
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
}
