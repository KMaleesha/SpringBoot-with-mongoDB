package org.myonlinestore.springwithmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class userModel {

    @Id
    private String id;
    private String username;
    private String email;
    private int age;
    private int mobileNumber;

}
