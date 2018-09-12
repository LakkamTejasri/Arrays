import java.util.Scanner;


public class A14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elemnet");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the removed elment");
		int r=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==r)
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			c++;
			break;
		}
		}
		if(c==0)
		{
			System.out.println("elemnet not found");
		}
		else{
			for(int i=0;i<a.length-1;i++)
			{
			System.out.println(a[i]);
			}
				
		}
		

	}
}
