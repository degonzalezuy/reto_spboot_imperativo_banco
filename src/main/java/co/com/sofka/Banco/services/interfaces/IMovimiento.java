package co.com.sofka.Banco.services.interfaces;


import co.com.sofka.Banco.model.Movimiento;

public interface IMovimiento {
    public Movimiento buscarMovimientoPorId(Long id);
    public Movimiento guardarMovimiento(Movimiento movimiento);
    public Movimiento eliminarMovimiento(Movimiento movimiento);
    public Movimiento modificarMovimiento(Movimiento movimiento);
}
