package org.javaacademy.employee;

import java.math.BigDecimal;
import org.javaacademy.human.Gender;

public class Manager extends Employee {

    private static final BigDecimal HOURLY_RATE = BigDecimal.valueOf(10000.0);

    public Manager(String name, String surname, String patronymic, Gender gender, BigDecimal earnedAmount) {
        super(name, surname, patronymic, gender, earnedAmount);
        setHourlyRate(HOURLY_RATE);
    }

}
