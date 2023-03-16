package co.com.sofka.Banco.services.interfaces;

import co.com.sofka.Banco.dto.ClienteDto;
import co.com.sofka.Banco.model.Cliente;

public interface ICliente {
    public ClienteDto buscarClientePorId(Long id);
    public ClienteDto guardarCliente(ClienteDto clienteDto);
    public ClienteDto eliminarCliente(Long id);
    public ClienteDto modificarCliente(ClienteDto clienteDto, Long id);

}
