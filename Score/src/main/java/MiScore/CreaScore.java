package MiScore;

public class CreaScore {
	
	private int contador = 0;
	private int n = 0;
	
	public void setValores(int x) {
		n = x;
	}
	
	public int setContador() {
		if(n == 0) {
			return contador;
		}else {
			if((n % 5) == 0) {
				contador = contador + 5;
				return contador;
			}else {
				if((n % 2) == 0) {
					contador = contador + 1; 
					return contador;
				}else {
					contador = contador + 3;
					return contador;
				}
			}
		}
	}
}
