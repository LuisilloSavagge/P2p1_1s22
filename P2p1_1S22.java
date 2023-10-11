import java.util.Scanner;

public class P2p1_1s22{
	public static void main(String[] args) {
		int opc = 3;
		int a,b,resultado;
		
		/*
		switch(opc){
		case 1:
			System.out.println("Aqui estamos en la primera opcion");
			break;
		case 2:
			System.out.println("Aqui estamos en la segunda opcion");
			break;
		case 3:
			System.out.println("Aqui estamos en la tercera opcion");
			break;
		default:
			System.out.println("No existe el valor dentro de los casos");
		}
	
	char opc1='a';
	switch(opc1){
	case 'a':
		System.out.println("Selecciono A");
		break;
	case 'b':
		System.out.println("Selecciono B");
		break;
	case 'c':
		System.out.println("Selecciono C");
		break;
	default:
		System.out.println("No esta dentro de las opciones");
	}
*/


	char opc2;
	Scanner teclado = new Scanner(System.in);
	System.out.println("elije una opcion r,s,m,d");
	opc2 = teclado.next().charAt(0);
	switch(opc2){
	case 's':
		System.out.println("Aqui ira las operaciones de suma");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println("Introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a+b;
		System.out.println("el resultado es" + resultado);
		break;
	case 'r':
		System.out.println("Aqui ira las operaciones de resta");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println("Introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a-b;
		System.out.println("el resultado es" + resultado);
		break;
	case 'm':
		System.out.println("Aqui ira las operaciones de multiplicacion");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println("Introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a*b;
		System.out.println("el resultado es" + resultado);
		break;
	case 'd':
		System.out.println("Aqui ira las operaciones de division");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println("Introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a/b;
		System.out.println("el resultado es" + resultado);
		break;
	default:
		System.out.println("No existe operacion a realizar");
	    }
	}
}