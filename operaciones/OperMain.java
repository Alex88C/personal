package operaciones;

import java.util.Scanner;

public class OperMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int continuar=1;
		while (continuar==1) {
		System.out.println("Selecciona una opcion ");
		System.out.println("1- SUMA");
		System.out.println("2- RESTA ");
		System.out.println("3- MULTIPLICACION ");
		System.out.println("4-DIVISION ");
		int opcion= entrada.nextInt();

		System.out.println("Dame el primer valor : ");
		int valorUno= entrada.nextInt();
		
		System.out.println("Dame el segundo valor valor : ");
		int valorDos= entrada.nextInt();
		if (opcion == 1) {
			Operacion valores = new Operacion(valorUno, valorDos);			
			valores.imprimirSuma();
		}
		else if (opcion==2) {
			Operacion valoresRest = new Operacion(valorUno, valorDos);
			valoresRest.imprimirResta();
		}
		else if (opcion==3) {
			Operacion valoresMult = new Operacion(valorUno, valorDos);
			valoresMult.imprimirMult();
			}
		else if (opcion==4) {
			Operacion valoresDiv = new Operacion(valorUno, valorDos);
			valoresDiv.imprimirDiv();
			}
		continuar=0;
		System.out.println("Deseas realizar otra operacion?");
		System.out.println("1- SI");
		System.out.println("2- NO");
		continuar= entrada.nextInt();
		}
	}
}

