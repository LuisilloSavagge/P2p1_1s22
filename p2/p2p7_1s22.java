public class p2p7_1s22{
	public static void main(String[] args) {
		System.out.println("numero de parametros ingresados desde linea de comando " + args.length);
		for(int a=0;a<args.length;a++){
			System.out.println("valor #"+a+ ": "+args[a]);
		}
	}
}