import java.util.*;
public class A2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
