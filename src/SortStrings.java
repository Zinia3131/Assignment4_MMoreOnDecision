import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three strings: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        String[] strings = {str1, str2, str3};
        Arrays.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }
    }
}

