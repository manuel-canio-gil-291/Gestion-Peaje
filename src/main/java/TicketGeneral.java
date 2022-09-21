package main.java;

public class TicketGeneral extends Ticket{

    protected TicketGeneral(float kmEntrada, float kmSalida, float precio) {
        super(kmEntrada, kmSalida, precio);
        
    }
    
    public float calculoTarifaGeneral(float kmRecorrido, float precio, float porcentaje) {
        float tarifa=0.00f;
        if(kmRecorrido >= 500.0) {
            System.out.println("Haciendo la bonificacion del 5%");
            porcentaje = (float)(5.00/100.0);
            tarifa = (kmRecorrido*precio)*porcentaje;
            System.out.println("Precio total de la tarifa: "+tarifa+" euros");
        }else{
            tarifa = kmRecorrido*precio;
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
        return "TicketGeneral []";
    }

	@Override
	public float calculoKmRecorrido(float kmEntrada, float kmSalida, float precio, float porcentaje) {
		float kmRecorrido = (float)Math.abs(kmSalida-kmEntrada);
        System.out.println("Total de kilometros recorridos: "+kmRecorrido+"km");
        calculoTarifaGeneral(kmRecorrido, precio, porcentaje);
        return kmRecorrido;
	}

    
}
