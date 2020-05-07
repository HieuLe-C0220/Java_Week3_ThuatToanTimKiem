import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiDaiNhat {
    public static void main(String[] args) {
        // Tạo 1 công cụ tìm kiếm
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        // Nhập 1 chuỗi
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Tìm chuỗi liên tục tối đa
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); // Simple statement
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        // Hiển thị ra màn hình chuỗi con liên tiếp
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
