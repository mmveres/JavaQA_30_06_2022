package ua.univer.lesson03;

import java.util.Arrays;

public class ProgramMatrix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[][] matrix = {
                {1, 1,  1},
                {0, 12, 1},
                {0, 0, 23},
        };

        int[][] m = new int[5][10];

        printArr(arr);
        System.out.println(Arrays.toString(arr));
        printMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix);

        int maxMatrixValue = matrix[0][0];
        int maxRowValue = matrix[0][0];
        int [] maxRowValueArr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            maxRowValue = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxRowValue< matrix[i][j])
                    maxRowValue=matrix[i][j];
            }
           // System.out.println("row max = "+ maxRowValue);
            maxRowValueArr[i] = maxRowValue;
            if (maxMatrixValue< maxRowValue)
                maxMatrixValue = maxRowValue;
        }
        System.out.println(Arrays.toString(maxRowValueArr));
        System.out.println(maxMatrixValue);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
