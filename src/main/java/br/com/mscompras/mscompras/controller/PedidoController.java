package br.com.mscompras.mscompras.controller;

import br.com.mscompras.mscompras.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pedido")
public class PedidoController {

    @PostMapping
    public ResponseEntity<?> salvarPedido(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedido);
    }
}
