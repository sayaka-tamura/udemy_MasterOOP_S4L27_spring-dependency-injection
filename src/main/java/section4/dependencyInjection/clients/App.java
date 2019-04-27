/**
 * @author : Sayaka Tamura
 * Apr 27, 2019
 * Udemy Master Object Oriented Design in Java
 * Section 4 Lecture 27 "Dependency Injeciton Part II"
 */
package section4.dependencyInjection.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import section4.dependencyInjection.vehicles.Vehicle;

public class App {
	public static void main(String[] args) {
		// Section4 Lecture 26
//		Vehicle raceCar = new Vehicle(new SmallEngine(100)); // proper Dependency Injection Part : new SmallEngine(100)
//		raceCar.crankIgnition();

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Vehicle car1 = (Vehicle) context.getBean("mrBeansCarLarge");
		car1.crankIgnition();
	}
}
