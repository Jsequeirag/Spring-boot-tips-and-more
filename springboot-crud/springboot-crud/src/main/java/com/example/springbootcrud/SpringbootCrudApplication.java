package com.example.springbootcrud;

import com.example.springbootcrud.model.Employee;
import com.example.springbootcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCrudApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
      /*  Employee employee = new Employee();
        employee.setFirstName("Jose Luis ");
        employee.setEmailId("1");
        employee.setLastName("Sequeira Góngora");
        employeeRepository.save(employee);*/
    }
}
