package main.java;

public abstract class Ticket implements ITicket {
    private final float kmEntrada;
    private final float kmSalida;
    private final float porcentaje;
    private final float precio;

    protected Ticket(float kmEntrada, float kmSalida, float precio) {
        this.kmEntrada = kmEntrada;
        this.kmSalida = kmSalida;
        this.porcentaje = 0.00f;
        this.precio = precio;
    }

    public float getKmEntrada() {
        return kmEntrada;
    }

    public float getKmSalida() {
        return kmSalida;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public float calculoKmRecorrido(float kmEntrada, float kmSalida) {
        float kmRecorrido = (float)Math.abs(kmSalida-kmEntrada);
        calculoTarifa(kmRecorrido, precio, porcentaje);
        return kmRecorrido;
    }

    public abstract float registroFinal(float kmSalida);

    @Override
    public float calculoTarifa(float kmRecorrido, float precio, float porcentaje) {
        float tarifa = kmRecorrido*precio;
        return tarifa;
    }
    
}
