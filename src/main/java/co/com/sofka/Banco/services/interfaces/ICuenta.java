package co.com.sofka.Banco.services.interfaces;

import co.com.sofka.Banco.model.Cuenta;

public interface ICuenta {
    public Cuenta buscarCuentaPorId(Long id);
    public Cuenta guardarCuenta(Cuenta cuenta);
    public Cuenta eliminarCuenta(Cuenta cuenta);
    public Cuenta modificarCCuenta(Cuenta cuenta);
}
