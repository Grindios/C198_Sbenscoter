package com.example.c198_sbenscoter.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.c198_sbenscoter.Database.Repository;
import com.example.c198_sbenscoter.Entity.Term;
import com.example.c198_sbenscoter.R;

public class CourseList extends AppCompatActivity {

    EditText editName;
    EditText editStartDate;
    EditText editEndDate;
    String name;
    String startDate;
    String endDate;
    int termID;
    Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        editName=findViewById(R.id.editTermName);
        editEndDate=findViewById((R.id.editTermEndDate));
        editStartDate=findViewById(R.id.editTermStartDate);

        termID = getIntent().getIntExtra("id", -1);
        name = getIntent().getStringExtra("name");
        startDate = getIntent().getStringExtra("Start");
        endDate = getIntent().getStringExtra("End");

        editName.setText(name);
        editStartDate.setText(startDate);
        editEndDate.setText(endDate);

        repository = new Repository(getApplication());

    }

    public void goToAssessmentList(View view) {
    }

    public void goToCoursDetailList(View view) {
        Intent intent = new Intent(CourseList.this, AssessmentList.class);
        startActivity(intent);
    }

    public void saveButton(View view) {
        Term term;
        if (termID == -1) {
            int newID = repository.getAllTerms().get(repository.getAllTerms().size() - 1).getTermID() + 1;
            term = new Term(newID, editName.getText().toString(), editStartDate.getText().toString(), editEndDate.getText().toString());
            repository.insert(term);
        } else {
            term = new Term(termID, editName.getText().toString(), editStartDate.getText().toString(), editEndDate.getText().toString());
            repository.update(term);
        }
    }
}