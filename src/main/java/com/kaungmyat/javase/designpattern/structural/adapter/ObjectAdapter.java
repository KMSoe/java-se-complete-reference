package com.kaungmyat.javase.designpattern.structural.adapter;

public class ObjectAdapter implements Api {
    LegacyApi legacy = new LegacyApi();

    @Override
    public void api() {
        this.legacy.oldApi();
    }
}
