package net.joywise.mybatisplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class MybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusApplication.class, args);
	}
}
