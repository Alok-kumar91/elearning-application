package in.alokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.alokit.entity.StudentDetail;

public interface StudentDetailRepo extends JpaRepository<StudentDetail, Integer> {

}
