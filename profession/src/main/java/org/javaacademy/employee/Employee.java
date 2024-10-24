package org.javaacademy.employee;

import lombok.Getter;
import lombok.Setter;
import org.javaacademy.Gender;
import org.javaacademy.Human;

import java.math.BigDecimal;

/**
 * Сотрудник
 */

@Getter
@Setter
public class Employee extends Human {
    private BigDecimal hourlyRate;

    public Employee(String name, String surname, String patronymic, Gender gender) {
        super(name, surname, patronymic, gender);
    }
}