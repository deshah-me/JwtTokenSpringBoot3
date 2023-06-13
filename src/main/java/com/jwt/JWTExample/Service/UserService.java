package com.jwt.JWTExample.Service;

import com.jwt.JWTExample.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
      store.add(new User(UUID.randomUUID().toString(),"Shah",
              "shah@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Deepak",
                "deepak@gmail.com"));

    }
    public  List<User> getUsers(){
        return this.store;
    }
}
