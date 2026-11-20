package dao;
import java.sql.Date;

public class Student {
	
	private int idStudent ;
	private String  fistNameStudent ;
	private String lastNameStudent;
	private Date dateBirthStudent ;
	
	public Student(String fistNameStudent, String lastNameStudent, Date dateBirthStudent) {
		super();
		this.fistNameStudent = fistNameStudent;
		this.lastNameStudent = lastNameStudent;
		this.dateBirthStudent = dateBirthStudent;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFistNameStudent() {
		return fistNameStudent;
	}

	public void setFistNameStudent(String fistNameStudent) {
		this.fistNameStudent = fistNameStudent;
	}

	public String getLastNameStudent() {
		return lastNameStudent;
	}

	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}

	public Date getDateBirthStudent() {
		return dateBirthStudent;
	}

	public void setDateBirthStudent(Date dateBirthStudent) {
		this.dateBirthStudent = dateBirthStudent;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", fistNameStudent=" + fistNameStudent + ", lastNameStudent="
				+ lastNameStudent + ", dateBirthStudent=" + dateBirthStudent + "]";
	}
	

}
