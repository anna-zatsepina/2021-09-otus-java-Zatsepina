package homework;

import java.util.*;

public class CustomerReverseOrder {

    private final Deque<Customer> customerList = new ArrayDeque<>();

    public void add(Customer customer) {
        customerList.add(customer);
    }

    public Customer take() {
        return customerList.pollLast(); //возвращает и удаляет последний добавленный элемент
    }
}