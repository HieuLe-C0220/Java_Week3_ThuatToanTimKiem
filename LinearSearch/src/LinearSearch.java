public class LinearSearch {
    static int[] list ={97,6,20,38,16,6,77,73,15,36,96,2,7,25,18,9};
    static int search(int[]array,int x) {
        for (int i=0;i<array.length;i++) {
            if (array[i]==x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(list,2));
        System.out.println(search(list,15));
        System.out.println(search(list,10));
        System.out.println(search(list,9));
        System.out.println(search(list,26));
        System.out.println(search(list,18));
    }
}
