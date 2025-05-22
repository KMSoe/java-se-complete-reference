package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.annotations;

import java.lang.reflect.Field;

public class NotNullProcessor {
    public static void checkNull(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field: fields) {
            NotNull anno = field.getAnnotation(NotNull.class);

            if (anno != null) {
                try {
                    //System.out.println("Field "+field.getName()+" have annotation");
                    Object value = field.get(obj);
                    if(value == null)
                    {
                        String message = anno.message();
                        if(!message.isEmpty())
                        {
                            System.err.println(message);
                        }
                        else
                        {
                            System.err.println("Field "+field.getName()+ " is null");
                        }
                        //System.err.println();
                        //System.err.println("Field "+field.getName()+ " is null");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
//        h.name = "Test";
        checkNull(h);

        Data data = new Data();
        checkNull(data);

    }
}
