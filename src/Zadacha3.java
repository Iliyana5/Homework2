import java.util.Scanner;
public class Zadacha3 {
public static void main(String[] args) {
    double Numbers[] = new double[5];
    Scanner sc = new Scanner(System.in);
    for (int index = 0; index < Numbers.length; index++) {
        Numbers[index] = sc.nextDouble();
        System.out.println(Numbers[index]);
    }

}

}


