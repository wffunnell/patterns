package hexagonal.application;

import hexagonal.domain.Employee;
import org.joda.time.DateTime;

public interface EmployeeRepository {
    Iterable<Employee> employeesRetrieved();

    Iterable<Employee> employeesWithBirthdayRetrieved(DateTime today, EmailService emailService);
}
