package com.example.c198_sbenscoter.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.c198_sbenscoter.Database.Repository;
import com.example.c198_sbenscoter.Entity.Term;
import com.example.c198_sbenscoter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterButton(View view) {
        Intent intent = new Intent(MainActivity.this, TermList.class);
        startActivity(intent);

        //test code
        Repository repo = new Repository(getApplication());
        Term term = new Term(1, "Spring Term", "Today", "Tomorrow");
        repo.insert(term);
    }
}