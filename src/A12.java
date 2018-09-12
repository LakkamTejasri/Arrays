import java.util.*;


public class A12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elmente");
		int h=a[0];
		for(int i=0;i<a.length;i++)

		{
			a[i]=sc.nextInt();
			if(h<a[i])
			{
				h=a[i];
			}
		}
		
		System.out.println(h);
		
	}

}
