package com.kaungmyat.javase.chapter_18_string;

class Data {
    int value;

    public Data(int value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        System.out.println("ToString called");
        return "Data{" + "value=" + value + '}';
    }
}

public class StringMethod {
    public static void main(String[] args) {
        Data data = new Data(20);

        String str = "hello" + " world " + false;

        System.out.println("str "+str);
        System.out.println("length "+str.length());

        System.out.println(""+data);

        System.out.println("CharAt(0) "+str.charAt(0));

        char chars[]= new char[5];
        str.getChars(0, 5, chars, 0);

        String str2 = new String(chars);
        System.out.println("Str2 " + str2);

        System.out.println("regiionMatch " + str.regionMatches(0, str2, 0, 4));
        System.out.println("st2 startWith " + str.startsWith("hello"));
        System.out.println("Str endWith " + str.endsWith("false"));

        System.out.println("Apple.compareTo(Banana) " + "apple".compareTo("banana"));
    }
}
