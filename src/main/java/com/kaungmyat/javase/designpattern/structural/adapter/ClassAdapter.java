package com.kaungmyat.javase.designpattern.structural.adapter;

public class ClassAdapter extends LegacyApi implements Api {
    @Override
    public void api() {
        super.oldApi();
    }
}
