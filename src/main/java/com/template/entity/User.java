package com.template.entity;

import com.template.enums.Roles;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "user_view")
public class User {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long userId;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;
  @Column(nullable = false,unique = true)
  private String email;
  private Roles role;
  private String phoneNumber;
  private String password;
  private String city;
  private String address;

  @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
  private Cart cart;


}
