import java.util.*;

public class Ejercicio4{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		for(int i=0; i<20; i++){
			int edad;

			System.out.print("Para saber si es mayor o menor de edad ingrese su edad");
			edad = entrada.nextInt();

			if(edad <18){
				System.out.println("\nUsted es menor de edad");
			}else{
				System.out.println("\nUsted es mayor de edad");
			}
		}
	}
}