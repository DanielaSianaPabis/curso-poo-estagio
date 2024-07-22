package Secao20.Aula255_Predicate.util;

import Secao20.Aula255_Predicate.entities.Product;

import java.util.function.Predicate;


public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
