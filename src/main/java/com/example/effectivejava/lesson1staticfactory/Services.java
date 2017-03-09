package com.example.effectivejava.lesson1staticfactory;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

	private Services() {}
	
	private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
	
	public static final String DEFAULT_PROVIDER_NAME = "def";
	
	public static void registerDefaultProvider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}
	
	public static void registerProvider(String name, Provider p) {
		providers.put(name, p);
	}
	
	//ServicesAPI
	public static Service newInstance() {
		return null;
	}
	
	public static Service newInstance(String name) {
		Provider p = providers.get(name);
		Optional.ofNullable(p).orElseThrow(() -> new IllegalArgumentException());
		return p.newService();
	}
}
