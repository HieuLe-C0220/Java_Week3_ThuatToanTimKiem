import java.util.LinkedList;
import java.util.Scanner;

public class FindStringlengthMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        // Tìm thứ tự ngày càng tối đa
        for (int i=0;i<string.length();i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j=i+1;j<string.length();j++) {
                if (string.charAt(j)>list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size()>max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
