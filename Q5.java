// Special Pythagorean triplet
public class Q5 {
    public static void main(String[] args) {
        for(int i=3,j=4,k=5;i<=100000-2;i++,j++,k++){
            
            if(i*i+j*j==k*k){
                System.out.println(i+" "+j+" "+k);
                // if(i+j+k==1000)
                //     System.out.print(i);
            }j++;k++;
        }
    }
}

