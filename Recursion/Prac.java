class Prac{
    public static void main(String[] args) {
        int ind = 0;
        int []arr = {1,2,1,4,5};
        int target = 1;
        System.out.println("answer" + findLastOccurrence(arr,ind,target));

    }

    public static int findLastOccurrence(int[] arr, int ind, int target) {
        if (ind == arr.length) {
            return -1;
        }
        int res = findLastOccurrence(arr, ind + 1, target);
        if (res == -1 && arr[ind] == target) {
            return ind;
        }
        return res;
    }
    

}