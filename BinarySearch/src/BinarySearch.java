public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 15, 45, 50, 59, 60, 66, 69, 70, 79,96};
    static int binarySearch(int[] list,int key) {
        int low = 0;
        int high = list.length-1;
        while (high>=low) {
            int mid = (high+low)/2;
            if (key<list[mid]) {
                high = mid-1;
            } else if (key == list[mid]) {
                return mid;//trả về vị trí của key
            } else {
                low = mid +1;
            }
        }
        return -1;//đây là khi high < low, key không tồn tại
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,79));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,96));
    }
}
