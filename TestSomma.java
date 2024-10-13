package somma;

public class TestSomma {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	a1 = somma(2,3);
		System.out.println(a1);
		int b1 = differenza(8,2);
	

	}
	
	public static int somma(int a, int b) {
		return a + b;
	}

	public static int differenza(int a, int b) {
		return a - b;
	}
	
	public int prodotto(int a, int b) {
		return a * b;
	}
	
	public int divisione(int a, int b) {
		return a/b;
	}
}
