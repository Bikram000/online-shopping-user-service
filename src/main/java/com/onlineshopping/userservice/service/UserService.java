package com.onlineshopping.userservice.service;

import com.onlineshopping.userservice.entity.Users;
import com.onlineshopping.userservice.repository.UserRepository;
import com.onlineshopping.userservice.virtualObject.Product;
import com.onlineshopping.userservice.virtualObject.UserWithProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    public UserWithProduct getUserWithProductDetail(Long userId){

        UserWithProduct userWithProduct = new UserWithProduct();

        Users user = userRepository.findByUserId(userId);
        Product product = restTemplate.getForObject("http://PRODUCT-CATALOG-SERVICE/product/" + user.getProductId(), Product.class);
        userWithProduct.setUsers(user);
        userWithProduct.setProduct(product);
        return userWithProduct;

    }
}
