package com.onlineshopping.userservice.virtualObject;

import com.onlineshopping.userservice.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWithProduct {

    private Users users;
    private Product product;
}
