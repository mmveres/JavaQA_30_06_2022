package ua.univer.lesson12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramEx {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] marks = new int[5];
        fillArray(marks);
        System.out.println(Arrays.toString(marks));

    }

    private static void fillArray(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = validateData(i);
        }
    }

    private static int validateData(int i) {
        while (true) {
            try {
                System.out.println("Enter " + i + " elem of marks ");
                //   int valueInt = ;
                return validateMark(getIntFromConsole());
            } catch (MarkException e) {
                System.err.println(e.getMessage() + " : " + Arrays.toString(e.getStackTrace()));
                try {
                    FileWriter fw = new FileWriter("log.txt");
                    fw.write(e.getMessage() + " : " + Arrays.toString(e.getStackTrace()));
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private static int getIntFromConsole()  {
        try {
            String str = sc.next();
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new MarkException(" Not int "+e.getMessage());
        }
    }

    private static int validateMark(int mark) throws MarkException {
        if (mark < 1 || mark > 12) throw new MarkException(" Not mark ");
        return mark;
    }
}
