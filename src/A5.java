
public class A5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,l=0;
		int[] a={4,2,5,7,11,13,20,90};
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			l++;
		}
		System.out.println(sum/l);

	}

}
