package com.ssafy.eureka.domain.user.repository;

import com.ssafy.eureka.domain.user.dto.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    Optional<UserEntity> findByUserId(int userId);
    Optional<UserEntity> findByPhoneNumber(String phoneNumber);
}