package group.project.spring.dao;

import java.util.List;

import group.project.spring.model.Enrollment;
import group.project.spring.model.Student;

/**
 * Defines DAO operations for course.
 *
 */
public interface EnrollmentDAO {
	
	public void saveEnroll(int courseId, int studentId);
	
	public void delete(int courseId, int studentId);
	
	public void deleteAll(int courseId);
	
	public List<Enrollment> getStudents(int courseId);
	
	public List<Enrollment> getEnrollmentList(int courseId);
}
