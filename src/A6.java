import java.util.*;

public class A6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0, c = 0,l=0;
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter the element ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			c=0;
			for (int j = 1; j <= a[i]; j++)
			{	
				if (a[i] % j == 0) 
				{
					c++;
				}
			}
			if (c == 2) {
				s = s + a[i];
				l++;
			}
		}	
		System.out.println(s/l);

	}


}
