
package songuyento;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to tu 1 den 100 la:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu n chia hết cho i, n không phải là số nguyên tố
            }
        }
        return true;
    }
}

