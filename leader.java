class Main {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int[] leaders = new int[n];
        int index = 0;
        int max = arr[n - 1];
        leaders[index++] = max;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders[index++] = max;
            }
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}