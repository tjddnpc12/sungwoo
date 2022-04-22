package com.example.planets.JpaRepository;

import com.example.planets.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, String>, CrudRepository<UsersEntity, String> {
    @Query(value = "select name from users", nativeQuery = true)
    List<String> findByUsers();
}
