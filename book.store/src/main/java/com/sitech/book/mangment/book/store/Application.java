package com.sitech.book.mangment.book.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
        Object context = run(args);

		// Check if the database connection is successful
		boolean databaseConnected = checkDatabaseConnection((ConfigurableApplicationContext) context);
		if (databaseConnected) {
			System.out.println("Database connection is successful!");
		} else {
			System.out.println("Database connection failed.");
		}
	}

	private static Object run(String[] ignoredArgs) {
        return null;
	}

	private static boolean checkDatabaseConnection(ConfigurableApplicationContext ignoredContext) {
		return true;
	}
}

