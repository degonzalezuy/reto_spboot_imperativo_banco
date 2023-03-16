package co.com.sofka.Banco.controller;

import co.com.sofka.Banco.dto.ClienteDto;

import co.com.sofka.Banco.exception.ResourceNotFoundException;
import co.com.sofka.Banco.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<ClienteDto>> getClientes(){
        return ResponseEntity.ok().body(service.buscarClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto>getClientePorId(@PathVariable(value="id") Long clienteId) throws ResourceNotFoundException {
        ClienteDto clienteDto = service.buscarClientePorId(clienteId);
        return ResponseEntity.ok().body(clienteDto);
    }

    @PostMapping
    public ResponseEntity<ClienteDto> guardarCliente(@RequestBody ClienteDto clienteDto){

        return ResponseEntity.ok().body(service.guardarCliente(clienteDto));
    }

    @PutMapping
    public ResponseEntity<ClienteDto> actualizarCliente(@RequestBody ClienteDto clienteDto, @PathVariable Long id){
        ClienteDto clienteDto1 = service.modificarCliente(clienteDto, id);

        return ResponseEntity.ok().body(clienteDto1);
    }
}
