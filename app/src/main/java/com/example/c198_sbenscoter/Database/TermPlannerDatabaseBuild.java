package com.example.c198_sbenscoter.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.c198_sbenscoter.DAO.AssessmentDAO;
import com.example.c198_sbenscoter.DAO.CourseDAO;
import com.example.c198_sbenscoter.DAO.TermDAO;
import com.example.c198_sbenscoter.Entity.Assessment;
import com.example.c198_sbenscoter.Entity.Course;
import com.example.c198_sbenscoter.Entity.Term;

@Database(entities={Term.class, Course.class, Assessment.class}, version=1, exportSchema = false)
public abstract class TermPlannerDatabaseBuild extends RoomDatabase {
    public abstract TermDAO termDAO();

    public abstract CourseDAO courseDAO();

    public abstract AssessmentDAO assessmentDAO();

    private static volatile TermPlannerDatabaseBuild INSTANCE;

    static TermPlannerDatabaseBuild getDatabase(final Context context) {
        if (INSTANCE == null) {
        synchronized (TermPlannerDatabaseBuild.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), TermPlannerDatabaseBuild.class, "termPlannerDatabase.db")
                        .fallbackToDestructiveMigration()
                        .build();
            }
        }
    }
        return INSTANCE;
}
}
