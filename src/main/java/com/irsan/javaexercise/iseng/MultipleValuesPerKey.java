package com.irsan.javaexercise.iseng;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.*;
import java.util.stream.Collectors;

public class MultipleValuesPerKey {

    public static void main(String[] args) {
        MultiValueMap<Object, Object> multiValueMap = new LinkedMultiValueMap<>();
        Map<Object, Object> map = new HashMap<>();
        multiValueMap.add("Ikan", "Salmon");
        multiValueMap.add("Ikan", "Peda");
        multiValueMap.add("Ikan", "Hiu");
        multiValueMap.add("Ikan", "Paus");
        multiValueMap.add("Ayam", "Pelung");
        multiValueMap.add("Ayam", "Jago");
        for (Map.Entry singleMap : multiValueMap.entrySet()) {
            map.put(singleMap.getKey(), singleMap.getValue());
        }

        System.out.println(map);
    }

    private static String arrayToString(List<String> list) {
        return list.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
