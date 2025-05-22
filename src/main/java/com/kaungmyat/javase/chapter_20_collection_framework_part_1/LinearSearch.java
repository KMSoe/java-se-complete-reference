package com.kaungmyat.javase.chapter_20_collection_framework_part_1;

public class LinearSearch {
    public static int search(int arr[],int item)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == item)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,2,4,5,1,12};

        System.out.println("Search 3: "+search(arr,3));
        System.out.println("Search 5: "+search(arr,5));
    }
}
