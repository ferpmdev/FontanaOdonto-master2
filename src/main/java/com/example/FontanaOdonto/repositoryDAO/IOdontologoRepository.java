package com.example.FontanaOdonto.repositoryDAO;

import com.example.FontanaOdonto.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository  extends JpaRepository<Odontologo, Integer> {
}
