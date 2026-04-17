class Main {
    public static void main(String[] args) {
        int n=145;
        int original=n;
        int sum=0;
        while (n>0) {
            int digit=n%10;
            int fact=1;
            for (int i=1; i<=digit;i++) {
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if (sum==original) {
            System.out.println("strong number");
        } else{
            System.out.println("not strong number");
        }
    }
}