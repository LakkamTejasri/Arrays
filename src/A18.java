
public class A18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow=0,p=1;
		int[] a={3,4,5,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=pow;j++)
			{
				p=p*a[i];
				
			}
			System.out.println(p);
			
		}
		pow++;
	}

}
