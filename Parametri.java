package parametri;

public class Parametri {

	public static void main(String[] args) {
		
		System.out.println("Elenco parametri");
		if (args.length == 0) {
			System.out.println("nessun parametro");
			return;
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
