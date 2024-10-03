import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingresa la opcion");
		System.out.println("1.- rectangulo");
		System.out.println("2.- triangulo");
		 Scanner scanner = new Scanner(System.in);
	     // Solicitar al usuario las dimensiones del rectángulo
		 int opc = scanner.nextInt();
		 if (opc ==1) {
			 System.out.println("Ingrese la base del triangulo: ");
		        double base = scanner.nextInt();

		        System.out.println("Ingrese la altura del triangulo: ");
		        double altura = scanner.nextInt();
		        double area = base * altura;
		        double perimetro = 2 * (base + altura);
		        
		        

		        // Mostrar los resultados
		        System.out.println("Área del rectángulo: " + area);
		        System.out.println("Perímetro del rectángulo: " + perimetro);
		 }
		 if (opc ==2) {
			 
			 System.out.println("1.- Carlcular área");
			 System.out.println("2.- Carlcular perimetro");
			 
			 int Elec = scanner.nextInt();
			 if (Elec ==1) {
				 System.out.print("Ingrese la base del triangulo: ");
			        double base = scanner.nextInt();

			        System.out.print("Ingrese la altura del triangulo: ");
			        double altura = scanner.nextInt();
			        
			        double area = (base * altura)/2;
			        
			        
			        

			        // Mostrar los resultados
			        System.out.println("Área del triangulo: " + area);
			 }
			 if (Elec ==2) {
			 System.out.println("Ingrese lado 1 del triangulo: ");
		        double Lado1 = scanner.nextInt();

		        System.out.println("Ingrese lado 2 del triangulo: ");
		        double Lado2 = scanner.nextInt();
		        
		        System.out.println("Ingrese lado 3 del triangulo: ");
		        double Lado3 = scanner.nextInt();
		        
		        double Per = Lado1 + Lado2 + Lado3;
		        
		        
		        

		        // Mostrar los resultados
		        System.out.println("Perimetro del triangulo: " + Per);
				}
		       
		 }
		 
	        

	        // Calcular el área y el perímetro
	        
	        
	}

}
