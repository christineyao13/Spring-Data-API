package com.example.demo.one.to.n.repositories;

import com.example.demo.one.to.n.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {
    List<Company> findByName(String name);
}
