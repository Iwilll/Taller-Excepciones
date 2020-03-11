package tallerWilliamM;

public class Subject {

	private Student student;
	private double grade;
	
	public Subject() {
	}

	public Subject (Student student, double grade) throws InvalidVauleException {
		if((0 <= grade )&&(grade<=5)){
			this.student = student;
			this.grade = grade;
		}
		else {
			throw new InvalidVauleException("Nota no valida ");
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
