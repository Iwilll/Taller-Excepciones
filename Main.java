package tallerWilliamM;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre y edad del estudiante");
		Student s1 = new Student(sc.nextLine(), sc.nextInt());
		System.out.println("Ingrese nota del estudiante");
		try {
			Subject u1 = new Subject(s1, sc.nextDouble());
		}
		catch (InvalidVauleException ex) {
            System.out.println(ex.getMessage());
		}
		
		

	}

}
