/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Security.Service;

import com.portfolio.afunes.Security.Entity.Rol;
import com.portfolio.afunes.Security.Enums.RolNombre;
import com.portfolio.afunes.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author agufu
 */
@Service
@Transactional
public class RolService {
   @Autowired
   iRolRepository irolRepository;
   
   public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return irolRepository.findByRolNombre(rolNombre);
   }
   
   public void save(Rol rol){
       irolRepository.save(rol);
   }
}
