package com.sinensia.lambdas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        for (int i = 0; i < melons.size(); ++i) {
            System.out.println(melons.get(i).toString());
        }

        List<Melon> bailan = Filters.filterByType(melons, "gac");

        System.out.println("Lista filtrada:");
        for (Melon melon : bailan) System.out.println(melon.toString());

        List<Melon> found = Filters.filterByWeight(melons, 1200);

        System.out.println("Lista filtrada:");
        for (Melon melon : found) System.out.println(melon.toString());

        List<Melon> found2 = Filters.filterByWeightHigherOrSmaller(melons, 3400, false);

        System.out.println("Lista filtrada:");
        for (Melon melon : found2) System.out.println(melon.toString());
    }


}
