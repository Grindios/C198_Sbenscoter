package com.example.c198_sbenscoter.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.c198_sbenscoter.R;

public class CourseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
    }

    public void goToAssessmentList(View view) {
        Intent intent = new Intent(CourseList.this, AssessmentList.class);
        startActivity(intent);

    }
}