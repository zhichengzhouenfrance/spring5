package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

public class ApplicationContext {

	@Test
	public void resourceLoaderTest() {
		ResourceLoader resourceLoader = new FileSystemResourceLoader();
		Resource resource =  resourceLoader.getResource("D:/spring21site/README");
		assertThat(resource).isInstanceOf(FileSystemResource.class);
		
		Resource urlResource = resourceLoader.getResource("file:D:/spring21site/README");
		assertThat(urlResource).isInstanceOf(UrlResource.class);
	}
}
