package co.com.sofka.Banco.interfaces;

import co.com.sofka.Banco.dto.ClienteDto;
import co.com.sofka.Banco.model.Cliente;

public interface ICliente {
    public ClienteDto buscarClientePorId(Long id);
    public ClienteDto guardarCliente(ClienteDto clienteDto);
    public ClienteDto eliminarCliente(ClienteDto clienteDto);
    public ClienteDto modificarCliente(ClienteDto clienteDto);

}
