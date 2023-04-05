package com.example.FontanaOdonto.repositoryDAO;

import com.example.FontanaOdonto.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
