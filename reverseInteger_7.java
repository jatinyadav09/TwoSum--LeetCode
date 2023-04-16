public class reverseInteger_7 {
        public int reverse(int x) {
            long sum=0;
            while(x!=0){
                long rem = x%10;
                sum = sum*10 + rem;
                x=x/10;
            }
            if(sum<Integer.MIN_VALUE || sum> Integer.MAX_VALUE){
                return 0;
            }
            return (int) sum;
        }    
}
