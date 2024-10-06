class SubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 7;

        int l = 0;
        int min = Integer.MAX_VALUE;
        int current_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            while (current_sum >= target) {
                min = Math.min(min, i - l + 1);
                current_sum -= arr[l];
                l++;
            }
        }

        System.out.println("Minimum length subarray: " + min);
    }
}