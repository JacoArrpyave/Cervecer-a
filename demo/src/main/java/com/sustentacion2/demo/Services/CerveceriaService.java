package com.sustentacion2.demo.Services;

import java.util.ArrayList;
import java.util.List;


import com.sustentacion2.demo.Domain.Cerveceria;
import com.sustentacion2.demo.Repository.CerveceriaRepository;

public class CerveceriaService {
    
    
    public Cerveceria findByName(String name,CerveceriaRepository cerveceriaRepository) {
        List<Cerveceria> cervecerias = new ArrayList<>();

        cervecerias.addAll(cerveceriaRepository.findAll());

        for (Cerveceria cerveceria : cervecerias) {
            if (cerveceria.getNombre().equals(name)){
                return cerveceria;
            }
        }

        return null;

    }
}
