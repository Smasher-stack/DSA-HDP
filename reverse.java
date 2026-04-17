class reverse{
    public static void main(String[] args) {
        int n = 1534236469;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.println(0);
                return;}
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println(rev);
    }
}