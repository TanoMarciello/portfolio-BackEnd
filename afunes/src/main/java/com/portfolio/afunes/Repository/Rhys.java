/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.afunes.Repository;

import com.portfolio.afunes.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author agufu
 */
public interface Rhys extends JpaRepository<hys, Integer> {
        Optional<hys> findByNombre(String nombre);
        public boolean existsByNombre(String nombre);
}
