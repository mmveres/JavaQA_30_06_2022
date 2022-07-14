package ua.univer.lesson05;

public class MyString {
    private char[] str;

    public MyString(char[] str) {
        this.str = str;
    }

    public MyString(char ch) {
        this.str = new char[]{ch};
    }

    public char charAt(int i){
        return this.str[i];
    }
}
