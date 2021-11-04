import java.util.Scanner;

public class VND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        double money;

        System.out.println("Nhap so tien USD: ");
        usd = scanner.nextDouble();

        money = usd * vnd;
        System.out.println("so tien` ban nhap co gia tri: " + money);
    }
}
