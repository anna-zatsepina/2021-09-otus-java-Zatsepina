package homework;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private final TreeMap<Customer, String> customerSorted = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer,String> first = customerSorted.firstEntry();
        if (first != null) {
            return Map.entry(new Customer(first.getKey()), first.getValue());
        } else {
            return null;
        }
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer,String> highest = customerSorted.higherEntry(customer);
        if (highest != null) {
            return Map.entry(new Customer(highest.getKey()), highest.getValue());
        } else {
            return null;
        }
    }

    public void add(Customer customer, String data) {
        customerSorted.put(customer, data);
    }

}