public class Zadacha5 {
    public static void main(String[] args) {
        int[] original = {10, 12, 1, 8, 4};
        int[] copy = original;
        System.arraycopy(original, 0, copy, 0, original.length);
        for (int i = 0; i < original.length; i++)
            System.out.println(original[i]);
        for (int i = 0; i < copy.length; i++)
            System.out.println(copy[i]);
    }
}

