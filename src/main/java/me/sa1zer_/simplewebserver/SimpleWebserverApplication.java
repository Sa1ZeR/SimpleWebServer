package me.sa1zer_.simplewebserver;

import me.sa1zer_.simplewebserver.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebserverApplication.class, args);
		Config config = new Config();
		System.out.println(config.uploadDir);
	}

}
