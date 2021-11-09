import java.util.Scanner;

public class clase{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int num;

                System.out.println("Vamos a sumar 2 números enteros.\n");
                System.out.print("Introduce el primer número: ");
                num = Integer.parseInt(sc.next());
                System.out.print("Introduce el segundo número: ");
                num += Integer.parseInt(sc.next());

                System.out.println("\nLa suma es: " + num);
		par(num);

                sc.close();
        }

	public static void par(int num){
		if (num%2 == 0) {
			System.out.println("\nEl número es par.");
		} else
			System.out.println("\nEl número es impar.");

	}
}
