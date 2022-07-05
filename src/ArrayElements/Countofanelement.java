package ArrayElements;

public class Countofanelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]x= {1,2,2,3,3,4,5,6,7,8,9,9};
		int n= 3;
		int co=0;
		for(int i=0;i<x.length;i++) 
		{
			if(x[i]=n)
			{
				co=co+1;
			}
		}
		System.out.println("number of elements fount = " +co);
		

	}

}
