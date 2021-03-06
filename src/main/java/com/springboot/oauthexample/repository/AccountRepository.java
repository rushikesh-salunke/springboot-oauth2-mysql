package com.springboot.oauthexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.oauthexample.entities.Account;

import java.util.Optional;


public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
