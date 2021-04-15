
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = (int)(Math.random()*10)+1;
		System.out.println("los divisores de "+numero+" son: ");
		for(int i=1; i<=numero; i++) {
			
			if((numero % i) == 0) {
				System.out.print(i+" ");
				
			}
			
		}
	}

}
