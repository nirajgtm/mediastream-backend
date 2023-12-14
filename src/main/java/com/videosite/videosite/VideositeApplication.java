package com.videosite.videosite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.videosite.videosite")
@EnableJpaRepositories("com.videosite.videosite")
public class VideositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideositeApplication.class, args);
	}

}