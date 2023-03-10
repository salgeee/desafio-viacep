package com.example.leonardosalge.cep.entities;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cep {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
}
