import java.io.IOException;
import java.util.*;
import java.io.*;
public class A4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,l=0;
		int[] a={4,46,23,75,90};
		for(int i=0;i<a.length;i++)
		{
			try{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
				l++;
				//System.out.println(sum/0);
			}
			}
			catch(ArithmeticException e){
				
				System.out.println(sum/l);
			}
		}
		System.out.println(sum/l);
	}
}
