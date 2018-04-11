package com.b10301051.tim.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Context;
import android.content.ClipData;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    private Button button01;
    private ClipData.Item op1_text;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 = (Button)findViewById(R.id.button1);

        button01.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //TODO button click
                intent = new Intent(MainActivity.this, Page1Activity.class);
                EditText editText = (EditText) findViewById(R.id.edit1);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
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
