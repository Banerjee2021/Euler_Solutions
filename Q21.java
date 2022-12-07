public class Q21 {
        public static void main(String[] args) {
        int s=0,s1=0,s2=0,i,j;
        for(i=1;i<10000;i++)
        {s1=0;
        s2=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                    s1+=j;
            }
            for(j=1;j<s1;j++)
                if(s1%j==0)
                    s2+=j;
            if(i==s2&&s1!=s2)
                s+=i;
            
        }
        System.out.println("Sum of all the amicable numbers under 10000="+s);
    
        }
    
    }
