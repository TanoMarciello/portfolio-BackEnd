
package com.portfolio.afunes.Interface;

import com.portfolio.afunes.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona>   getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Elimiar una persona por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
