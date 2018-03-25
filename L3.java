package by.tr.module4;
import java.util.Random;

public class L3 {
	public static void main (String [] args) {
		int[] mas = new int[10];
		enterArrayWithRandom(mas);
	}
		public static void enterArrayWithRandom (int [] mas) {
			Random rand = new Random ();
		for (int i = 0; i < mas.length; i++) {
			mas[i]=rand.nextInt(50);
			System.out.println("mas["+i+"]="+mas[i]);
		}
		}
		public static boolean isSortedByMinToMax(int[] mas) {
		    for (int i = 0; i < mas.length-1;i++)
		    {
		        if (mas[i] > mas [i+1]) {
		        	return false;
		        }
		     }
return true;
}
		
}