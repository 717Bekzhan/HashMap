package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  Car деген класс тузунуз (Id, номер авто)
        //Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
        //HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        //HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.
        HashMap<Car,InfoCar> carHashMap = new HashMap<>();
            carHashMap.put(new Car(12222,199),new InfoCar(
                    LocalDate.of(2003,2,4),"Honda Fit",2000,"white"));
            carHashMap.put(new Car(122,2344),new InfoCar(
                    LocalDate.of(2004,2,4),"Toyota Ist",2000,"red"));

        System.out.println(carHashMap.entrySet());
    }
}
