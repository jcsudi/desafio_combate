package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Champion c1, c2;

		System.out.println("Digite os dados do primeiro campeão ");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		System.out.print("Vida inicial:");
		int life1 = sc.nextInt();
		System.out.print("Ataque:");
		int attack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();

		c1 = new Champion(name1, life1, attack1, armor1);

		System.out.println();
		sc.nextLine();

		System.out.println("Digite os dados do segundo campeão ");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial:");
		int life2 = sc.nextInt();
		System.out.print("Ataque:");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();

		c2 = new Champion(name2, life2, attack2, armor2);

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();

		System.out.println();

		c1.takeDamage(c2);
		c2.takeDamage(c1);

		for (int i = 0; i < n; i++) {

			System.out.println("Resultado do turno " + (i + 1) + ":");
			System.out.println(c1.status() );
			System.out.println(c2.status() );
			
			if(c1.getLife() == 0 || c2.getLife() == 0 ) {
				i = n;
			}
			c1.takeDamage(c2);
			c2.takeDamage(c1);
			
			System.out.println();		
			
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		
		/*
		 * System.out.println(c1.getName()); System.out.println(c2.getName());
		 * System.out.println(c1.getLife()); System.out.println(c2.getLife());
		 * 
		 * if(c2.getArmor() > c1.getAttack()) { int vida = c2.getLife() - 1;
		 * System.out.println(vida); }
		 * 
		 * if(c1.getLife() <=0 || c2.getLife()<=0) {
		 * System.out.println("Morreu um jogador"); }/*
		 * 
		 * /*int n = sc.nextInt();
		 * 
		 * 
		 * 
		 * for (int i = 0; i < n; i++) { System.out.println("Digite os dados do " + (i +
		 * 1) + "campeão."); System.out.print("Name: "); sc.nextLine();
		 * System.out.println("Vida inicial: "); sc.nextInt();
		 * System.out.println("Ataque: "); sc.nextInt();
		 * System.out.println("Armadura: "); sc.nextInt();
		 * c1.takeDamage(c2.getAttack()); System.out.println(c1.status()); if
		 * (c1.getLife() == 0) { System.out.println("FIM DO COMBATE"); break; }
		 * c2.takeDamage(c1.getAttack()); System.out.println(c2.status()); if
		 * (c2.getLife() == 0) { System.out.println("FIM DO COMBATE"); break; } }
		 */
	}
}
