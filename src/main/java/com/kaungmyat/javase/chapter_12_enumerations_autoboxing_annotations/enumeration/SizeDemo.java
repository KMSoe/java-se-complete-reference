package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.enumeration;

enum Size
{
    Small(5),Medium(7),Large(10),XL(15);

    int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize()
    {
        return this.size;
    }
}

public class SizeDemo {
    public static void main(String[] args) {
        Size small = Size.Small;
        Size medium = Size.Medium;

        if(medium.getSize() > small.getSize())
        {
            System.out.println("Meidum > Small ");
        }
        System.out.println("XL Ordinal "+ Size.XL.ordinal()); // position
    }
}
