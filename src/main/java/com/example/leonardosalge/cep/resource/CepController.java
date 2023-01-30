package com.example.leonardosalge.cep.resource;


import com.example.leonardosalge.cep.entities.Cep;
import com.example.leonardosalge.cep.repositories.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ceps")
public class CepController {

    @Autowired
    CepRepository cepRepository;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}")
    public Cep getCep(@PathVariable("cep") String cep) {
        return cepRepository.getDados(cep);
    }
}
