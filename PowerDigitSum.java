public class PowerDigitSum {
    public static void main(String[] args) {
        int r=(int)Math.pow(2,1000),s=0;
        for(int i=r;i!=0;i/=10){
            int d=i%10;
            s+=d;
        }
        System.out.println(s);       
    }
}
