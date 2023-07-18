package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {

    @Test
    void shouldAddItem() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(28, "хлеб", 15);
        Product product2 = new Product(45, "молоко", 66);
        Product product3 = new Product(86, "сыр", 97);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
    }

    @Test
    void shouldRemoveItem() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(28, "хлеб", 15);
        Product product2 = new Product(45, "молоко", 66);
        Product product3 = new Product(86, "сыр", 97);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.remove(45);

        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}