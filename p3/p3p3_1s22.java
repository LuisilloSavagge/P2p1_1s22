import java.util.Scanner;
public class P3p2_1s22{
	static Scanner teclado=new Scanner(System.in);
	public static void Suma() {
	System.out.println("Suma de dos numeros");
	System.out.println("Ingresa el primer numero");
	int a=teclado.nextInt();
	System.out.println("Ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a+b;
		System.out.println("La suma fue" + c);
	}
	public static void Resta() {
	System.out.println("Resta de dos numeros");
	System.out.println("Ingresa el primer numero");
	int a=teclado.nextInt();
	System.out.println("Ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a-b;
		System.out.println("La resta fue " + c);
	}
	public static void Divicion() {
	System.out.println("Divide de dos numeros");
	System.out.println("Ingresa el primer numero");
	int a=teclado.nextInt();
	System.out.println("Ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a/b;
		System.out.println("La divicion fue " + c);
	}
	public static void Multiplicacion() {
	System.out.println("Multiplicar de dos numeros");
	System.out.println("Ingresa el primer numero");
	int a=teclado.nextInt();
	System.out.println("Ingresa el segundo numero");
		int b=teclado.nextInt();
		int c=a*b;
		System.out.println("La multiplicación fue " + c);
	}

	public static void Menú() {
	System.out.println("Operaciones Basicas");
	System.out.println("\n A) Suma");
	System.out.println("\nB) Resta");
	System.out.println("\nC) Divicion");
	System.out.println("\nD) Multiplicacion");
	System.out.println("\n Que operacion deseas");
    }
    public static void Salir(){
    System.out.println("salir de la aplicacion");
}
    public static void main(String[] args) {
    	Menú();
    	String opc = teclado.nextLine();
    	if(opc.equals("A")) Suma();
    	if(opc.equals("B")) Resta();
    	if(opc.equals("C")) Divicion();
    	if(opc.equals("D")) Multiplicacion();
    	if(opc.equals("E")) Salir();
    }
        
        boolean estado = true;
    	while(estado){
    	switch(opc){
    	case 's': estado=false;
    	}
    }  