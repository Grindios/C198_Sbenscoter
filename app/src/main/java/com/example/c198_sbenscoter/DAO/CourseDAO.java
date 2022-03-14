package com.example.c198_sbenscoter.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.example.c198_sbenscoter.Entity.Course;
@Dao
public interface CourseDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertCourse(Course course);

    @Update
    void updateCourse(Course course);

    @Delete
    void deleteCourse(Course course);

    //@Query("SELECT * FROM coursesTable ORDER BY courseID ASC")
    //List<Term> getAllCourses();
}
