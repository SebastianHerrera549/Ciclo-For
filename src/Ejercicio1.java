public class Ejercicio1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num = (int)(Math.random()*10)+1; // numeros aleatorios de 1 a 10
    int mul= 1;
	
    for (int i =1; i<=num; i++) 
	{
	mul	= mul*i;
	}
    System.out.println("El factorial de "+num+" es "+mul);
	}
}