package com.kaungmyat.javase.chapter_08_inheritance;

//parent,super class,based,generic
class TwoD
{
    private int x,y;
    public TwoD(int x,int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("TwoD Constructor");
    }
    void print()
    {
        System.out.println("X "+x+ " Y "+y);
    }
}

//child, subclass,inherited class,specific
class ThreeD extends TwoD
{
    int z;
    public ThreeD(int x, int y , int z)
    {
        super(x,y);
        this.z = z;

        System.out.println("ThreeD Constructor");
    }
    void print()
    {
        super.print();
        System.out.println("Z "+this.z);
    }
}

public class Coordinate {
    public static void main(String[] args) {
        ThreeD obj = new ThreeD(10,2,5);
        obj.print();
    }
}
