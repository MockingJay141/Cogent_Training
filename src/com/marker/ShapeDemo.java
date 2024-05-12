package com.marker;

public class ShapeDemo {

    public Boolean delete(Object object) {
        if (!(object instanceof Deletable)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Deletable d1 = new Entity();
        Deletable d2 = new Entity1();
        Entity2 d3 = new Entity2();
        ShapeDemo sd = new ShapeDemo();

        if (sd.delete(d1)){

        }
    }
}
