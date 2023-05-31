package in.alokit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetail")

public class StudentDetail {
		@Id
	private Integer studentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Addid")
    private Address add;

	private String studentName;
	private Integer rollNum;
	private String email;
	private Long mobileNum;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getRollNum() {
		return rollNum;
	}
	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public StudentDetail(Integer studentId, Address add, String studentName, Integer rollNum, String email,
			Long mobileNum) {
		super();
		this.studentId = studentId;
		this.add = add;
		this.studentName = studentName;
		this.rollNum = rollNum;
		this.email = email;
		this.mobileNum = mobileNum;
	}
	public StudentDetail() {
		super();
	}
	
	

}
