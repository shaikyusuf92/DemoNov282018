package com.java.practise.maps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> monthsMap = new HashMap<>();
        monthsMap.put(1,"January");
        monthsMap.put(2,"Febraury");
        monthsMap.put(3,"March");
        monthsMap.put(4,"April");




        /*for(Map.Entry<Integer, String> entry : monthsMap.entrySet())
        {
            System.out.println("Key: " +entry.getKey() + " Value: "+entry.getValue());
        }*/
        /*Set<Map.Entry<Integer, String>> entries = monthsMap.entrySet();
        System.out.println(entries);

        for(Map.Entry<Integer,String> entry : monthsMap.entrySet())
        {
            System.out.println("Key: " +entry.getKey());
        }*/

        //monthsMap.forEach();

       /* monthsMap.forEach((k,v)-> System.out.println("Key: " +k +" Value: " +v ));


        List<Integer> monthsList = new LinkedList<>();
        monthsList.add(1);
        monthsList.add(2);
        monthsList.add(3);

        monthsList.forEach(System.out::println);
        monthsList.forEach(i-> System.out.println("i: "+ i));*/

        /*Iterator<Map.Entry<Integer,String>> iterator = monthsMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println("Key : " +entry.getKey() + " Value: " + entry.getValue());
        }*/

        //Set<Map.Entry<Integer, String>> entries = monthsMap.entrySet();

        /*Set<Integer> integers = monthsMap.keySet();
        for(Integer integer : integers)
        {
            System.out.println("Key: " +integer + " Value: " + monthsMap.get(integer));
        }*/

        //monthsMap.entrySet().stream().filter(e->"January".equals(e.getValue())).forEach(e-> System.out.println("Key: " +e.getKey()));

        //monthsMap.entrySet().forEach(System.out::println);

        //monthsMap.entrySet().forEach(e-> System.out.println("Key: " +e.getKey() +" Value: " +e.getValue()));



        //map.entrySet() will give you set of Map.Entry<Type,Type> entrySet you can use entrySet.getKey() and entrySet.getValue() in for each
        //map.forEach((k,v)->sout(k,v)
        //map.keySet() will return set of keys and use this set and map.get(key) in a for each combination
        //stream gets closed once traversed or operated on
        //Map.of(1,"January",2,"February",3,"March",4,"April") this map of Type Integer and String
        //From Java 10 local variable type inference is smarter and equal to java script style
        //You denote a variable as var a = 10, var b= 10.f, var c= 10.89d var s = "string",
        //but var can never be null or cannot be left un initialized also you can now use it on for each loop soooo smart!

        var a = 10;
        var b = 30.333;
        int[] array = {1,2,3,4};
        for(var i : array)
        {
            System.out.println(i);
        }

        System.out.println(a);

    }
}
