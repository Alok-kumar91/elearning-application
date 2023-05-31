package in.alokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.alokit.entity.StudentDetail;
import in.alokit.repo.StudentDetailRepo;
@Service
public class StudentDetailServiceImpl implements StudentDetailService {
	@Autowired
   private StudentDetailRepo sdr;
	@Override
	public String saveStudent(StudentDetail sd) {
		 sdr.save(sd);
		return null;
	}

	@Override
	public List<StudentDetail> getAllStudent() {
		List<StudentDetail> allSd = sdr.findAll();
		return allSd;
	}

}
