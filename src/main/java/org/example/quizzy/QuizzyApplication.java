package org.example.quizzy;

import lombok.RequiredArgsConstructor;
import org.example.quizzy.entity.Employee;
import org.example.quizzy.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class QuizzyApplication {

	private final EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(QuizzyApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			employeeService.addEmployee(new Employee("John", "Doe", 50000));
			employeeService.addEmployee(new Employee("Jane", "Dona", 50000));
			employeeService.addEmployee(new Employee("Alice", "Smith", 60000));
			employeeService.addEmployee(new Employee("Bob", "Brown", 45000));

			employeeService.getAllEmployees().forEach(
					employee -> System.out.println(employee.getId() + " - " + employee.getFirstName() + " - " + employee.getLastName() + " - " + employee.getSalary())
			);
		};
	}
}
