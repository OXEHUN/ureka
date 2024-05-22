package com.ssafy.eureka.domain.user.dto;

import com.ssafy.eureka.domain.user.dto.request.SignUpRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotNull
    @Column(length = 6)
    private String userBirth;

    @NotNull
    private char userGender;

    @NotNull
    @Column(length = 30)
    private String userName;

    @NotNull
    @Column(unique = true, length = 255)
    private String phoneNumber;

    @NotNull
    @Column(length = 255)
    private String password;

    @NotNull
    @Column(columnDefinition = "DATETIME")
    private LocalDateTime registeredAt = LocalDateTime.now();

    @NotNull
    private Boolean isUnregistered;

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime unRegisteredAt;

    public static UserEntity signUpUser(SignUpRequest signUpRequest, String password, String phoneNumber) {
        UserEntity user = new UserEntity();
        user.userName = signUpRequest.getUserName();
        user.userBirth = signUpRequest.getUserBirth();
        user.userGender = signUpRequest.getUserGender();
        user.password = password;
        user.phoneNumber = phoneNumber;
        user.isUnregistered = false;
        return user;
    }

    public void updatePassword(String password){
        this.password = password;
    }

    public void unRegistUser(){
        this.isUnregistered = true;
        this.unRegisteredAt = LocalDateTime.now();
    }
}
