package by.tr.module4;
import java.util.Random;
import java.util.Scanner;
public class L2 {
	public static void main (String [] args) {
		int[] mas = new int[10];
		enterArrayWithRandom(mas);

	}
    public static int readKFromKonsole() {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	int k;
    	System.out.println("Insert k: ");
        while (!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Insert k: ");
        } 
    	k = sc.nextInt();
    	return k;
    }
    
	public static void enterArrayWithRandom (int [] mas) {

		Random rand = new Random ();
	for (int i = 0; i < mas.length; i++) {
		mas[i]=rand.nextInt(200);
		System.out.println("mas["+i+"]="+mas[i]);
	}
}
	public static void sum (int [] mas, int k) {
	int sum = 0;
	for (int i = 0; i<mas.length; i++) {
		if (mas [i] % k == 0) {
			sum += mas[i];
			System.out.println("Sum is" + sum);
		}

       }
	}
	
}
  
	