package operazioni;

public class Operazioni {
	static int prova = 7;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prova);
		
		int	som1 = somma(2,3);
		System.out.println(som1);
		
		int diff1 = differenza(8,2);
		System.out.println(diff1);
		
	int prod1 = Operazioni.prodotto(3,4);
	System.out.println(prod1);
	
	int div1 = divisione(30, 10);
	System.out.println(div1);
	}
	
	public static int somma(int a, int b) {
		return a + b;
	}

	public static int differenza(int a, int b) {
		return a - b;
	}
	
	public static int prodotto(int a, int b) {
		return a * b;
	}
	
	public static int divisione(int a, int b) {
		return a/b;
	}
}
