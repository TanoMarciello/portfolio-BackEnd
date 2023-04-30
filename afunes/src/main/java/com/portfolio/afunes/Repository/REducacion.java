/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Repository;

import com.portfolio.afunes.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author agufu
 */
@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
     public Optional<Educacion> findByNombreEd(String nombreEd);
     public boolean existsByNombreEd(String nombreEd);
    
}
