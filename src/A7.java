import java.util.Scanner;


public class A7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}	
			
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+ ",");
		}
		

	}

}
