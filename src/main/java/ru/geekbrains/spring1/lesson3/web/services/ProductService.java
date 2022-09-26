package ru.geekbrains.spring1.lesson3.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring1.lesson3.web.entities.Product;
import ru.geekbrains.spring1.lesson3.web.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }
}
