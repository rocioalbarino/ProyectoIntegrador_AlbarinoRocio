package com.portfolio.rocioalba.Interface;

import com.portfolio.rocioalba.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    //Traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por ID
    public void deletePersona(Long id);

    //Buscar una persona ID
    public Persona findPersona(Long id);

}
