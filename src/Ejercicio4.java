
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =(int)(Math.random()*10)+1;
		int itera =0;
		int mul =1;
		System.out.println("El nuumero es = "+num);
		for(int i=0; i <= num; i++ ) {
			itera = itera+i;
		}
		System.out.println("La suma de las iteraciones es = "+itera);
		System.out.println("La raiz cuadrada de  "+num+" es " +Math.sqrt(num));
		System.out.println("El numero alearorio entre 1 y "+num+ " es "+((int)(Math.random()*num)+1));
		System.out.print("Los divisores de "+num+" son: ");
		for(int i=1; i<=itera; i++) {
		 	if((num % i) == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=1; i<=num; i++) {
			mul	= mul*i;
		}
		System.out.println("El factorial de "+num+" es "+mul);
		int suma =0;
		for(int i=1; i<num; i++) {
			
			if((num % i) == 0) {
				suma =suma + i;				
			}
			
		}
		if (num == suma) {
			System.out.println("El numero es PERFECTO");
			
		}else {
			System.out.println("El numero es NO PERFECTO");
		}
		
		
	}

}
