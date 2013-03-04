import java.util.Scanner;
import java.util.InputMismatchException;

class Division{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa para dividir");
		System.out.println();

		try{
			int numerador, denominador, resultado;
			System.out.print("Digite el numerador: ");
			numerador = sc.nextInt();
			System.out.print("Digite el denominador: ");
			denominador = sc.nextInt();
			resultado = numerador / denominador;
			System.out.println("El resultado es: "+resultado);
		} catch (ArithmeticException ae){
			System.out.println("No se puede dividir en cero!!!");
		} catch (InputMismatchException ime){
			System.out.println("Debe digitar solamente numeros enteros");
		} finally {
			System.out.println("Muchas Gracias, hasta luego.");
		}
	}
}