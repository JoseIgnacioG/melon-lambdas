package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public final class Filters {

    public Filters(){
        throw new AssertionError("Utiliy class can not be instantianted");
    }

    public static List<Melon> filterByType(List<Melon> melons, String type) {
        if(melons == null || type == null)
            throw new IllegalArgumentException("Melons/type cannot nbe null");

        if(melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for(Melon melon : melons){
            if(melon !=null && type.equalsIgnoreCase(melon.getType())){
                result.add(melon);
            }
        }

        return result;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight) {
        if(melons == null || weight <= 0)
            throw new IllegalArgumentException("Melons/weight cannot be null or negative");

        if(melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for(Melon melon : melons){
            if(melon !=null && weight == melon.getWeight()){
                result.add(melon);
            }
        }

        return result;
    }

    public static List<Melon> filterByWeightHigherOrSmaller(List<Melon> melons, int weight, boolean mayor) {
        if(melons == null || weight <= 0)
            throw new IllegalArgumentException("Melons/weight cannot be null or negative");

        if(melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for(Melon melon : melons)
        {
            if(melon !=null)
            {
                if(mayor)
                {
                    if (weight < melon.getWeight())
                        result.add(melon);
                }
                else
                {
                    if (weight > melon.getWeight())
                        result.add(melon);
                }
            }
        }

        return result;
    }

    public static List<Melon> filterMelons(List<Melon> melons, MelonPredicate predicate) {
        if(melons==null) {
            throw new IllegalArgumentException("Melons cannot be null");
        }
        List<Melon> result = new ArrayList<>();
        for(Melon melon: melons) {
            if(melon!=null && predicate.test(melon)) {
                result.add(melon);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        if(list==null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        List<T> result = new ArrayList<>();
        for(T t: list) {
            if(t!=null && predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
