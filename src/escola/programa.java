package escola;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Aluno alu = new Aluno();
		
		System.out.print("Nome: ");
		alu.name = sc.nextLine();
		System.out.println();
		System.out.println("Notas: ");
		alu.a = sc.nextDouble();
		alu.b = sc.nextDouble();
		alu.c = sc.nextDouble();
		
		System.out.println("Soma de todas as notas: " + alu.totalGrade());
		
		if (alu.totalGrade() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTANDO %.2f PONTOS%n", alu.missingPoints());
			}
			else {
			System.out.println("APROVADO");
			}

		
		
		
		
		
		sc.close();
	}
}

