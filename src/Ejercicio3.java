
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume = 8128;
		int suma =0;
		for(int i=1; i<nume; i++) {
			
			if((nume % i) == 0) {
				suma =suma + i;				
			}
			
		}
		if (nume == suma) {
			System.out.println("El numero es PERFECTO");
			
		}else {
			System.out.println("El numero es NO PERFECTO");
		}
	}

}
