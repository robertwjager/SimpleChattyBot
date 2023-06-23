import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        

        System.out.println("The form for " + a + " is completed. We will contact you if we need a chef who cooks " + c + " dishes and has " + b + " years of experience. ");
    }
}
