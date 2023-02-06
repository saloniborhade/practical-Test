package com.assignment;

import com.assignment.dao.StudentDao;
import com.assignment.model.Student;

public class App
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // insert values
        Student student = new Student("saloni", "borhade", "saloniborhade@gmail.com");
        Student student1 = new Student("sejal", "Bhor", "Sejalbhor@gmail.com");
        Student student2 = new Student("vrushali", "Phodase", "phodasevruhali@gmail.com");

        //save values
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);


        studentDao.getStudent(1);
        studentDao.loadStudent(2);
        studentDao.getStudentById(3);
    }
 }

