/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Controller;

import com.portfolio.afunes.Dto.dtoEducacion;
import com.portfolio.afunes.Entity.Educacion;
import com.portfolio.afunes.Security.Controller.Mensaje;
import com.portfolio.afunes.Service.SEducacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author agufu
 */
@RestController
@RequestMapping("formacad")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu){
        if(StringUtils.isBlank(dtoedu.getNombreEd()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreEd(dtoedu.getNombreEd()))
            return new ResponseEntity(new Mensaje("Esa formación existe"), HttpStatus.BAD_REQUEST);
    
        Educacion educacion = new Educacion(dtoedu.getNombreEd(), dtoedu.getDescripcionEd(), dtoedu.getPeriodoEd(), dtoedu.getUbicacionEd(), dtoedu.getWebEd());
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Formación agregada"), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu){
        //Valido si existe el id
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
            //Existe exp con mismo nombre?
        if(sEducacion.existsByNombreEd(dtoedu.getNombreEd()) && sEducacion.getByNombreEd(dtoedu.getNombreEd()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa formación ya existe"), HttpStatus.BAD_REQUEST);
            //No puede ser vacio
        if(StringUtils.isBlank(dtoedu.getNombreEd()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreEd(dtoedu.getNombreEd());
        educacion.setDescripcionEd(dtoedu.getDescripcionEd());
        educacion.setPeriodoEd(dtoedu.getPeriodoEd());
        educacion.setUbicacionEd(dtoedu.getUbicacionEd());
        educacion.setWebEd(dtoedu.getWebEd());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Formación actualizada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
         //Valido si existe el id
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Formación eliminada"), HttpStatus.OK);
    }
}
