package br.com.mscompras.mscompras.model;

import br.com.mscompras.mscompras.dto.EnderecoDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Pedido {

    private String nome;

    private String produto;

    private BigDecimal valor;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dataCompra;

    private String cpf;

    private List<EnderecoDTO> enderecoEntrega;
}
