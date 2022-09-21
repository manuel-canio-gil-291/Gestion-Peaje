package main.java;

public abstract class Ticket implements ITicket {
    private float kmEntrada;
    private float kmSalida;
    private float tarifa=0.00f;

    public Ticket(float kmEntrada, float tarifa) {
        this.kmEntrada = kmEntrada;
        this.tarifa = tarifa;
    }
}
