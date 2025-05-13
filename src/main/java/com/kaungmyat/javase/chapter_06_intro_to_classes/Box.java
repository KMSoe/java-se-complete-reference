package com.kaungmyat.javase.chapter_06_intro_to_classes;

public class Box {
    int width, height,depth;

    int volume()
    {
        return this.width * this.height * this.depth;
    }

    public void setDimension(int width,int height,int depth)
    {
        this.width = width;
        this.height = height;
        this.depth =depth;
    }

    public static void main(String[] args) {
        int a = 10;
        Box box1 = new Box();
        Box box2 = new Box();

        box1.setDimension(10, 2, 5);

        int volume = box1.volume();

        box2.setDimension(5, 12, 5);

        int volume2 = box2.volume();

        System.out.println("Volume: " + volume);
        System.out.println("Voluem2: " + volume2);
    }
}
