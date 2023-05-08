/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.afunes.Repository;


import com.Portfolio.afunes.Entity.Portfolio;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author agufu
 */
@Repository
public interface RPortfolio extends JpaRepository<Portfolio, Integer>{
     public Optional<Portfolio> findByNombreP(String nombreP);
     public boolean existsByNombreP(String nombreP);
}
 