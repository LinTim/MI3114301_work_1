package com.b10301051.tim.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;

import android.content.Context;
import android.content.ClipData;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private ClipData.Item op1_text;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mhelp:
                Context context = MainActivity.this;
                String textToShow = "-=Tim's work=-\n -B10301051-";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.page1:
                intent = new Intent(MainActivity.this, Page1Activity.class);
                startActivity(intent);
                return true;
            case R.id.page2:
                intent = new Intent(MainActivity.this, Page2Activity.class);
                startActivity(intent);
                return true;

            case R.id.show_word:
                Context context1 = MainActivity.this;
                String textToShow1 = "word";
                Toast.makeText(context1, textToShow1, Toast.LENGTH_SHORT).show();

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
