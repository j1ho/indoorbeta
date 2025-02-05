package com.indoor_beta;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    // One user can upload many climbs
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Climb> climbs;

    // Getters and Setters...
}
