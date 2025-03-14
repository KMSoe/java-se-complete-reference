package com.kaungmyat.javase.chapter_17_record_switch;

sealed class MySealedClass permits Alpha, Beta
{

}

final class Alpha extends MySealedClass
{

}

final class Beta extends MySealedClass
{

}

public class SealClassDemo {
    public static void main(String[] args) {

    }
}
