package com.kaungmyat.javase.chapter_07_classes_methods;

class Demo {
    public void hello() {
        System.out.println("Hello");
    }
}

public class AccessControlDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.hello();
    }
}
