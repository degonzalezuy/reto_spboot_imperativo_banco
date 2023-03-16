package co.com.sofka.Banco.AppUtils;

import co.com.sofka.Banco.dto.ClienteDto;
import co.com.sofka.Banco.model.Cliente;

public class ClienteMapper {
    public static ClienteDto clienteToClientDto(Cliente cliente){
        ClienteDto clienteDto=new ClienteDto();
        clienteDto.setNombre(cliente.getNombre());
        clienteDto.setContrasena(cliente.getContrasena());
        clienteDto.setDireccion(cliente.getDireccion());
        clienteDto.setTelefono(cliente.getTelefono());
        clienteDto.setEstado(cliente.getEstado());
        return clienteDto;
    }

    public static Cliente clienteDtoToCliente(ClienteDto clienteDto){
        Cliente cliente=new Cliente();
        cliente.setNombre(clienteDto.getNombre());
        cliente.setContrasena(clienteDto.getContrasena());
        cliente.setDireccion(clienteDto.getDireccion());
        cliente.setTelefono(clienteDto.getTelefono());
        cliente.setEstado(clienteDto.getEstado());
        return cliente;
    }

}
