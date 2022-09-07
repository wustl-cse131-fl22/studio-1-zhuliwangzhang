package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
//		int x = 1;
		System.out.println("Value for y?");
		int y = in.nextInt();
//		int y = 1;
		System.out.println("Value for z?");
		int z = in.nextInt();
//		int z = 3;
		boolean isOrdered = true;
		isOrdered = (x > y && y > z) || (x < y && y < z);
		System.out.println(isOrdered);

	}

}
