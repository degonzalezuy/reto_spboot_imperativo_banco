package co.com.sofka.Banco.services;

import co.com.sofka.Banco.AppUtils.ClienteMapper;
import co.com.sofka.Banco.dto.ClienteDto;
import co.com.sofka.Banco.interfaces.ICliente;
import co.com.sofka.Banco.model.Cliente;
import co.com.sofka.Banco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ClienteService implements ICliente {

    @Autowired
    private ClienteRepository clienteRepository;
    public List<ClienteDto> buscarClientes(){
        return clienteRepository.findAll().stream().map(ClienteMapper::clienteToClientDto).toList();
    }

    public ClienteDto buscarClientePorId(Long id){
        return  null
    }

    @Override
    public ClienteDto guardarCliente(ClienteDto clienteDto) {
        Cliente cliente = ClienteMapper.clienteDtoToCliente(clienteDto);
        ClienteDto clienteDto1 = ClienteMapper.clienteToClientDto(clienteRepository.save(cliente));
        return clienteDto1;
    }

    @Override
    public ClienteDto eliminarCliente(Long id) {
        return null;
    }

    @Override
    public ClienteDto modificarCliente(ClienteDto clienteDto, Long id) {
        return null;
    }
}
