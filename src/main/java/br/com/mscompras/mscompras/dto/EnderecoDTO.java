package br.com.mscompras.mscompras.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private String rua;

    private String numero;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;
}
