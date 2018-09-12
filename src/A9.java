import java.util.Scanner;


public class A9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		System.out.println("enter  the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		if(a.length%2==0)
		{
		for(int i=0;i<a.length;i=i+2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		     
		}
		}
		else
		{
			for(int i=0;i<a.length-2;i=i+2)
			{
				
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			    
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
}
}	