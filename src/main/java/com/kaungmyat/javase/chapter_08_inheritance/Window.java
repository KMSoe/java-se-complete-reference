package com.kaungmyat.javase.chapter_08_inheritance;

class Window95
{
    public void startComputer()
    {
        System.out.println("Start computer");
    }
}
class Window98 extends Window95
{
    public void feature()
    {
        System.out.println("New Feature");
    }
}

public class Window {
    public static void main(String[] args) {
        Window98 win= new Window98();

        win.startComputer();
        win.feature();
    }
}
