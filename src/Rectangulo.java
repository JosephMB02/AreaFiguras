import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     // Solicitar al usuario las dimensiones del rectángulo
	        System.out.print("Ingrese la base del rectángulo: ");
	        double base = scanner.nextDouble();

	        System.out.print("Ingrese la altura del rectángulo: ");
	        double altura = scanner.nextDouble();

	        // Calcular el área y el perímetro
	        double area = base * altura;
	        double perimetro = 2 * (base + altura);

	        // Mostrar los resultados
	        System.out.println("Área del rectángulo: " + area);
	        System.out.println("Perímetro del rectángulo: " + perimetro);
	}

}
