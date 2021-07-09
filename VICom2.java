package task;

import java.util.*;

public class VICom2 {

	public static void main(String[] args) {
		System.out.println("Shopkeeper: voltage and current array size");
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hm;
		int vsize = sc.nextInt();
		int isize = sc.nextInt();
		System.out.println("shopkeeper: voltage elements");
		int[] voltage = new int[vsize];
		for (int i = 0; i < vsize; i++) {
			voltage[i] = sc.nextInt();
		}
		System.out.println("Shopkeeper: Current elements");
		int[] current = new int[isize];
		for (int i = 0; i < isize; i++) {
			current[i] = sc.nextInt();
		}
		System.out.println("customer please enter the R value");
		int r = sc.nextInt();
		int flag = 1;
		for (int i = 0; i < vsize; i++) {
			hm=new HashMap<>();
			for (int j = 0; j < isize; j++) {
				try {
					if ((float) voltage[i] / current[j] == (float)r && !hm.containsKey(voltage[i]) && !hm.containsValue(current[i]))
					{
						hm.put(voltage[i], current[j]);
						System.out.println(voltage[i] + "," + current[j]);
						flag++;
					}

				} catch (ArithmeticException e) {

				}
				
			}
			
		}
		if(flag==1)
			System.out.println("no combinations");
	}

}
