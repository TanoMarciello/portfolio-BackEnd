/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Service;

import com.Portfolio.afunes.Entity.Portfolio;
import com.portfolio.afunes.Repository.RPortfolio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agufu
 */
@Service
@Transactional
public class SPortfolio {
    @Autowired
    RPortfolio rPortfolio;
    
     public List<Portfolio> list(){
        return rPortfolio.findAll();
    }
    
    public Optional<Portfolio> getOne(int id){
        return rPortfolio.findById(id);
    }
    
    public Optional<Portfolio> getByNombreP(String nombreP){
        return rPortfolio.findByNombreP(nombreP);
    }
    
    public void save(Portfolio port){
        rPortfolio.save(port);
    }
    
    public void delete(int id){
        rPortfolio.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rPortfolio.existsById(id);
    }
    
    public boolean existsByNombreP(String nombre){
        return rPortfolio.existsByNombreP(nombre);
    }
    
}
