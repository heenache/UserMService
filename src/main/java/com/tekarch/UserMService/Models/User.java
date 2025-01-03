package com.tekarch.UserMService.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "uName",  unique = true)
    private String username;
    @Column(name = "email",  unique = true)
    private String email;
    @Column(nullable = false)
    private String password_hash;
    @Column(unique = true)
    private Integer phoneNumber;

    private Boolean two_FactorEnabled;
    // (columnDefinition = "Pending")
    private String kyc_status;

    private Date createdAt;
    private Date updatedAt;
}
