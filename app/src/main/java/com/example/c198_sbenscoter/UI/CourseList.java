package com.example.c198_sbenscoter.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.c198_sbenscoter.R;

public class CourseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
    }

    public void goToAssessmentList(View view) {
    }

    public void goToCoursDetailList(View view) {
        Intent intent = new Intent(CourseList.this, AssessmentList.class);
        startActivity(intent);
    }
}