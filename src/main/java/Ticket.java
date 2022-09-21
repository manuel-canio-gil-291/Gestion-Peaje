package main.java;

public abstract class Ticket implements ITicket {
    private final int kmEntrada;
    private final float porcentaje;

    protected Ticket(int kmEntrada, float porcentaje) {
        this.kmEntrada = kmEntrada;
        this.porcentaje = porcentaje;
    }

    public abstract float registroFinal(int kmSalida);
}
