public class Q3 {
    
	public static void main(String[] args) 
	{
		long num=600851475143l,m;
		
		for(long i=3;i<num;i=i+2)
		{
			while(num%i==0&& i<num)
				num/=i;
		}
		m=num;
		System.out.println("Largest prime factor:"+m);
			

	}

}

