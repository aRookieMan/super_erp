package scut.bigproject.super_erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"scut.bigproject.super_erp.controller", "scut.bigproject.super_erp.service"})
@MapperScan({"scut.bigproject.super_erp.controller.mapper"})
public class SuperErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperErpApplication.class, args);
	}

}

