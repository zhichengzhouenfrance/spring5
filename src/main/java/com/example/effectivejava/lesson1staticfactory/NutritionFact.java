package com.example.effectivejava.lesson1staticfactory;

import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;

public class NutritionFact {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder {
		private final int servingSize;
		private final int servings;
		
		private int calories;
		private int sodium;
		private int carbohydrate;
		
		public Builder (int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}
		
		public Builder sodium(int calories) {
			this.sodium = calories;
			return this;
		}
		
		public Builder carbohydrate(int calories) {
			this.carbohydrate = calories;
			return this;
		}
		
		public NutritionFact build() {
			return new NutritionFact(this);
		}
		
		
	}
	
	private NutritionFact (Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
}
