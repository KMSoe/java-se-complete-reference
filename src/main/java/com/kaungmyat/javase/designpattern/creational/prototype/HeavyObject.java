package com.kaungmyat.javase.designpattern.creational.prototype;

public class HeavyObject implements Prototype{
    String propertyGetFromDB;
    String computationalHungryProperty;

    static String getPropertyFromDB()
    {
        return "PropertyFromDb";
    }

    static String getCompuationalHungryProperty()
    {
        return "ComputationHungryProperty";
    }

    public HeavyObject() {
        this.propertyGetFromDB = HeavyObject.getPropertyFromDB();
        this.computationalHungryProperty = HeavyObject.getCompuationalHungryProperty();
    }

    @Override
    public String toString() {
        return "HeavyObject{" + "propertyGetFromDB=" + propertyGetFromDB + ", computationalHungryProperty=" + computationalHungryProperty + '}';
    }

    @Override
    public HeavyObject reproducce() {
        try {
            Prototype cop = (Prototype)super.clone();
            HeavyObject newObject = (HeavyObject)cop;

            return newObject;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
