package ArrayProblems;

public class evenPosition {
    public static void main(String[] args){
        int[] even= {45,78,90,32,21};
        for(int i=1;i<even.length;i=i+2){
            System.out.println("even position numbers are: " +even[i]);
        }
    }
}
