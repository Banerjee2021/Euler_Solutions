public class Q7 {
   
        public static void main(String[] args) {
            int n=2;
            int t=3;
            int pn=3;
            while(n<=10001)
            {
                if(isprime(t))
                    n++;
                pn=t;
                t+=2;
                
            }
            System.out.println("10001st prime number="+pn);
        }
        public static boolean isprime(int t)
        {
            for(int i=3;i<=Math.sqrt(t);i+=2)
                if(t%i==0)
                    return false;
            return true;
        }
    
    }
    

