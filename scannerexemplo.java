package POO;

import java.util.Scanner;

public class scannerexemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();

	}

}
