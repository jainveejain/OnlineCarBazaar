package com.app.repositories;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Jaas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Long> {

}
