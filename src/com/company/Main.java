package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //City деген класс тузунуз. (code, name, ...)
        //Эгерде code так сан болсо TreeSetke салыныз.
        //Аларды чонунан кичинесине караган тартипте чыгарыныз.

        Set<City> set = new HashSet<>();
        set.add(new City(123, "Osh"));
        set.add(new City(25, "Batken"));
        set.add(new City(122, "Bishkek"));

        System.out.println(set);
        set.removeIf(x -> x.getCode() % 2 == 0);
        Set<City> treeSet = new TreeSet<>(set);

        for (City city : treeSet) {
                System.out.println(city);
            }
        }
    }


