package Splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String email;
    private String phone;
}
