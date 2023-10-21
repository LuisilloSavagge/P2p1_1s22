public class P2p8_1s22{
 public static void main(String[] args) {
	if(args.length ==3){
		int a,b,r=0;
		char operacion ;
		operacion = args[1].charArt(0);
		a = integer.parseInt(args [0]);
		b = integer.parseInt(args [1]);
		switch(operacion){
		case 'x': r = a*b;break;
		case '+': r = a+b;break;
		case '_': r = a-b;break;
		case '/': r = a/b;break;
		}
		System.out.println("El resultado de la operacion fue: "+r);
	}else{
		System.out.println("No se puede realizar la operacion");
		}
    }
}