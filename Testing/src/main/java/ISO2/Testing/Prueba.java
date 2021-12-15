package ISO2.Testing;

public class Prueba {
	private int n1;
	private int n2;
	
	public Prueba(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int operar(int n) {
		if (n1 > n2)
			return n1 + n;
		else
			return n2 + n;
	}
	
	public boolean mayorN1() {
		return n1 > n2;
	}
	
	public boolean mayorN2() {
		return n1 < n2;
	}
	
	
}
