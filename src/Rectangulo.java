import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 char opc;
		 System.out.println("Selecciona la Figura ");
		 System.out.println("a) Rectangulo");
		 System.out.println("b) Circulo");
		 System.out.println("c) Triangulo");
		 System.out.println("x) Salir");
		 opc = scanner.next().charAt(0);
		 switch (opc) {
		 case ('a') :
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
	        break;
		 case ('b'): 
			 System.out.print("Ingrese el radio del circulo: ");
		 	 float radio = scanner.nextFloat();
			 float area2 = 3.146f*radio;
			 area2 = area2*area2;
			 System.out.println("Área del Circulo: " + area2); break;
		 case ('c'): break;
		 
		 case ('x') : System.out.println ("Adios, vuelva pronto");
			 
		 } while (opc != 'x');
	}
	
}
