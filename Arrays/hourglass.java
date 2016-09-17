import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
    for(int i=0; i < 6; i++){
        for(int j=0; j < 6; j++){
            arr[i][j] = in.nextInt();
        }
    }

    int maxVal = Integer.MIN_VALUE;
    int count = 0;

    // get each hour glass's sum and store it in a max variable
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            int midGlass = arr[i + 1][j + 1];
            int topGlassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
            int bottomGlassSum = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
            int tmpSum = topGlassSum + midGlass + bottomGlassSum;

            if (tmpSum > maxVal){
                maxVal = tmpSum;
            }
        }
    }

    System.out.println(maxVal);
}
}
