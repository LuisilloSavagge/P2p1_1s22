import java.util.Scanner;

public class P13_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;

		System.out.println("programa que realiza operaciones basicas");
		System.out.println("que operaciones desea: Suma, Resta, Division, Multiplicacion ");
		operacion = teclado.nextLine();
		if(operacion == "Suma"){

		  System.out.println("aqui debemos realizar una suma");
		  System.out.println("ingresa el primer numero:")
		  num1 =teclado.nextByte();
          System.out.println("ingresa el segundo numero:")
          num2 =teclado.nextByte();
          resultado = numm1 + num2;
          System.out.println("la suma es;" + resultado)


		}
		if(operacion.equals("Resta"){
			System.out.println("aqui debemos realizar una resta");

			 System.out.println("aqui debemos realizar una resta");
		  System.out.println("ingresa el primer numero:")
		  num1 =teclado.nextByte();
          System.out.println("ingresa el segundo numero:")
          num2 =teclado.nextByte();
          resultado = numm1 - num2;
          System.out.println("la resta es;" + resultado)

	}    else if (operacion.equals("Multiplicacion"))
		if (operacion.equals("multiplicacion")){
			 System.out.println("aqui debemos realizar una Multiplicacion");
		  System.out.println("ingresa el primer numero:")
		  num1 =teclado.nextByte();
          System.out.println("ingresa el segundo numero:")
          num2 =teclado.nextByte();
          resultado = numm1 * num2;
          System.out.println("la multiplicacion es;" + resultado)
			

	}    else if (operacion.equals("Division"))
		if (operacion.equals("Division")){
			 System.out.println("aqui debemos realizar una Division");
		  System.out.println("ingresa el primer numero:")
		  num1 =teclado.nextByte();
          System.out.println("ingresa el segundo numero:")
          num2 =teclado.nextByte();
          resultado = numm1 / num2;
          System.out.println("la Division es;" + resultado)

		}else{
			System.out.println("no existe opcion a realizar");