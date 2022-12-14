package org.hitech.service;
import java.util.HashMap;
import org.hitech.dao.*;
import org.hitech.model.*;

public class Student_Course_Service {
private static Student_Course_DAO scDAO=new Student_Course_DAO();
	
	
	public boolean addStudentCourseDetails(Student s, Course c) {
		boolean addStatus=scDAO.addStudentCourseDetails(s, c);
		return addStatus;
	}
	public HashMap<Student, Course> getStudentCourseDetails(){
		HashMap<Student, Course> hash=scDAO.getStudentCourseDetails();
		return hash;
	}
	public boolean deleteStudentCourseDetails(Student s) {
		boolean status=scDAO.deleteStudentCourseDetails(s);
		return status;
	}


}
