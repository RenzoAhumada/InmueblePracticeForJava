package com.renzo.spring.boot.inmuebles1.service;

import com.renzo.spring.boot.inmuebles1.model.Inmueble;
import com.renzo.spring.boot.inmuebles1.repository.InmuebleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{

    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository){

        this.inmuebleRepository = inmuebleRepository;
    }
    @Override
    public Inmueble saveInmueble(Inmueble inmueble)
    {
        inmueble.setFechadeCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }
    @Override
    public void deleteInmueble(Long inmuebleId){
        inmuebleRepository.deleteById(inmuebleId);
    }
    @Override
    public List<Inmueble> findAllInmuebles(){

        return inmuebleRepository.findAll();
    }
}
