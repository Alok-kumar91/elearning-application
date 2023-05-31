package in.alokit.service;

import java.util.List;

import in.alokit.entity.StudentDetail;

public interface StudentDetailService {
	
	public String saveStudent(StudentDetail sd);
	public List<StudentDetail> getAllStudent();

}
