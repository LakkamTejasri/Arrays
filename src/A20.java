
public class A20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c=0;
		int[] n={2,2,2,4,3,4,5,5,6,7};
		//int[] t=new int[n.length];
		for(int i=0;i<n.length;i++)
		{
			int c=0;
			for(int j=0;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					c++;
				}	

		   }
		
		
		System.out.println(c);
	}
	}
		}