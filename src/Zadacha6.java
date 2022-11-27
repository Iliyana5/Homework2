import java.util.Arrays;
public class Zadacha6 {
public static void main(String[] args) {
    int a[] = {1, 2, 3};
    int b[] = {1, 2, 3};
    boolean result = Arrays.equals(a, b);
    if (result == true) {
        System.out.println("Two arrays is equal:");
    } else
        System.out.println("Two arrays is not equal:");
}
}


