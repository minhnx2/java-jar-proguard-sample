package com.yhayashi30.sample;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yhayashi30.sample.models.Customer;
import com.yhayashi30.sample.models.Employee;
import com.yhayashi30.sample.models.Features;
import com.yhayashi30.sample.models.Flight;
import com.yhayashi30.sample.models.Seat;

/**
 * Hello world!
 *
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    private Customer customer;
    private Employee employee;
    private Features features;
    private Flight flight;

    public App() {
        ArrayList<Seat> seats = new ArrayList<>();
        customer = new Customer("a", "b", seats);
        employee = new Employee("a", "b", "c");
    }

    public static void main(String[] args) {
        logger.info("Hello World!");

        StringUtil stringUtil = new StringUtil();
        logger.info("StringUtil", stringUtil.add(1, 1));
    }
}
