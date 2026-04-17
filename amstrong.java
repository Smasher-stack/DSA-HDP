class amstrong{
    public static void main(String[] args) {
        int n=153;
        int og=n;
        int digits=0;
        int temp=n;
        while (temp>0) {
            digits++;
            temp/=10;
        }
        int sum=0;
        temp=n;
        while (temp>0) {
            int digit=temp%10;
            int power=1;
            for (int i=0;i<digits;i++) {
                power*=digit;
            }
            sum+=power;
            temp/=10;
        }
        if (sum==og) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}