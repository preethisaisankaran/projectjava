package ArrayProblems;

public class large {
    public static void main(String[] args) {
        int large[] = new int[4];
        large[0] = 34;
        large[1] = 46;
        large[2] = 78;
        large[3] = 40;
        int max, i;
        max = large[0];
        for (i = 1; i < large.length; i++) {
            if (large[i] > max)
                max = large[i];
        }
       System.out.println("largest number is:" +max);
    }
}
