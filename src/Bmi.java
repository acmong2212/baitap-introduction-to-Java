import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Nhap can nang cua ban (kilogram): ");
        weight = scanner.nextDouble();

        System.out.print("Nhap chieu cao cua ban (meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Chi so bmi cua ban la`: " + bmi);

        if (bmi < 18) {
            System.out.println("Ban dang thieu' can");
        } else if (bmi < 25) {
            System.out.println("Binh` thuong`");
        } else if (bmi < 30) {
            System.out.println("Ban dang thua` can");
        } else {
            System.out.println("Beo' phi` cmnr");
        }
    }
}
