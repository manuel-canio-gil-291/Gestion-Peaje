package main.java;

public class TicketEspecial extends Ticket{

    private final int pasajeros;

    protected TicketEspecial(float kmEntrada, float kmSalida, float precio, int pasajeros) {
        super(kmEntrada, kmSalida, precio);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public float calculoTarifaEspecial(float kmRecorrido, float precio, float porcentaje, int pasajeros) {
        float tarifa = 0.00f;
        if(kmRecorrido >= 100.0) {
            System.out.println("Haciendo la bonificacion del 10%");
            porcentaje = (float)(10.00/100.0);
            tarifa = ((kmRecorrido*precio)*pasajeros)*porcentaje;
            System.out.println("Precio total de la tarifa: "+tarifa+" euros");
        }else{
            tarifa = (kmRecorrido*precio)*pasajeros;
            System.out.println("Precio total de la tarifa: "+tarifa+" euros");
        }
        return tarifa;
    }

    @Override
    public float registroFinal(float kmSalida) {
        return this.getKmSalida();
    }

    
    public float registroInicial(float kmEntrada) {
        return this.getKmEntrada();
    }

    @Override
    public String toString() {
        return "TicketEspecial [pasajeros=" + pasajeros + "]";
    }

	@Override
	public float calculoKmRecorrido(float kmEntrada, float kmSalida, float precio, float porcentaje) {
		int pasajeros = this.pasajeros;
        System.out.println("Nº de pasajeros: "+pasajeros);
        float kmRecorrido = (float)Math.abs(kmSalida-kmEntrada);
        System.out.println("Total de kilometros recorridos: "+kmRecorrido+"km");
        calculoTarifaEspecial(kmRecorrido, precio, porcentaje, pasajeros);
        return kmRecorrido;
	}

    
}
