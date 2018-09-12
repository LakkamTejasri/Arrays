import java.util.Scanner;


public class A24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the duplicte elments");
		int s=sc.nextInt();
		int[] t=new int[s];
		for(int i=0;i<a.length;i++)
		{
	
				if(t[i]==a[i])
				{
					c++;
					break;
				}
				System.out.println(c);
			}
	}

}
