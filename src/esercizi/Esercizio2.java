package esercizi;

import classi.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Esercizio2 {
    public static List<Order> getOrdersWithBabyProducts(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> "Baby".equalsIgnoreCase(product.getCategory())))
                .collect(Collectors.toList());
    }
}
