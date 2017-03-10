package com.example.effectivejava.lesson1staticfactory;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;

import com.google.common.collect.Lists;

public class SomeExample {
	public static void main(String[] args) {
		Lists.newArrayList();
		Collections.emptyList();
		NutritionFact nf = new NutritionFact.Builder(5, 6).calories(6).calories(19).build();
		LombokTest.builder().id(1).name("est").build();
		SingletonExample.newInstance();
		SingletonSecondExample.INSTANCE.test();
	}
}
