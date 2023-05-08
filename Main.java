import java.util.Scanner;

public class Main {
    private static String binaryInput;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the binary number here: ");
        binaryInput = scanner.next();

        BinaryConverter convertNew = new BinaryConverter(binaryInput);
        System.out.println("Denary: " + convertNew.convertToDenary());
    }   
}