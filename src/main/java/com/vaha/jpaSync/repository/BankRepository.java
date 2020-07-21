package com.vaha.jpaSync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaha.jpaSync.domain.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
