
package sumofdigits;


import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap mot so nguyen: ");
            int n = scanner.nextInt();
            int sum = 0;
            
            // Xử lý trường hợp n là số âm
            n = Math.abs(n);
            
            while (n != 0) {
                sum += n % 10; // Cộng chữ số cuối cùng vào tổng
                n /= 10;       // Loại bỏ chữ số cuối cùng
            }
            
            System.out.println("Tong cac chu so la: " + sum);
        }
    }
}
