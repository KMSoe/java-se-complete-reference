package com.kaungmyat.javase.chapter_12_enumerations_autoboxing_annotations.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    String message() default "";
}
