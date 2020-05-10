public class BinarySearch {
    static int binarySearch(int[] list,int low,int high,int key) {
        if (high>=low) {
            int mid = (low+high)/2;
            if (list[mid]==key) {
                return mid;
            } else if (list[mid]>key) {
                return binarySearch(list,0,mid-1,key);
            } else {
                return binarySearch(list,mid+1,high,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int high = arr.length;
        System.out.println(binarySearch(arr,0,high,4));
        System.out.println(binarySearch(arr,0,high,10));
        System.out.println(binarySearch(arr,0,high,50));
        System.out.println(binarySearch(arr,0,high,70));
    }
}
