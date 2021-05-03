package escola;

public class Aluno {
	public String name;
	public double a;
	public double b;
	public double c;
	
	public double totalGrade() {
		return a + b + c;
	}
	public double missingPoints() {
		if (totalGrade() < 60.0) {
		return 60.0 - totalGrade();
		}
		else {
		return 0.0;
		}
		}
		}