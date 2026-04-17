class prime{
    public static void main(String[] args) {
        int N=20;
        int count=0;
        for (int i=2;i<=N;i++) {
            boolean isPrime=true;
            for (intj=2;j*j<=i;j++) {
                if(i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+ " ");
                count++;
            }
        }
        System.out.println("\nCount:" + count);
    }
}