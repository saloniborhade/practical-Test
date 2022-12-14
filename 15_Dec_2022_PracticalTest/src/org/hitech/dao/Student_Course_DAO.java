package org.hitech.dao;
import java.util.HashMap;
import org.hitech.model.Course;
import org.hitech.model.Student;


public class Student_Course_DAO {
public static HashMap<Student,Course> hash=new HashMap<>();
	
	public boolean addStudentCourseDetails(Student s, Course c) {
		boolean addStatus=false;
		hash.put(s,c);
		addStatus=true;
		return addStatus;
	}
	public HashMap<Student, Course>getStudentCourseDetails(){
		return hash;
	}
	public boolean deleteStudentCourseDetails(Student s){
		boolean status=false;
		hash.remove(s);
		status=true;
		return status;
	}

}

	