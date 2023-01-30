package com.example.leonardosalge.cep.repositories;


import com.example.leonardosalge.cep.entities.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cep", url = "https://viacep.com.br")
public interface CepRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/ws/{cep}/json/")
    Cep getDados(@PathVariable ("cep") String cep);
}
