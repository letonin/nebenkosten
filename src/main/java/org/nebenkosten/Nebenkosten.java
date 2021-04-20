package org.nebenkosten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

@EntityScan
@SpringBootApplication
public class Nebenkosten {

	public static void main(String[] args) {
		final List<String> candidates = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, null);
		candidates.forEach(System.out::println); //print all autoconfiguration
		SpringApplication.run(Nebenkosten.class, args);
	}
}
