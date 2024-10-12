/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

public class FacadeViajes {
    private SistemaVuelos vuelos;
    private SistemaHoteles hoteles;
    private SistemaTaxis taxis;

    public FacadeViajes() {
        this.vuelos = new SistemaVuelos();
        this.hoteles = new SistemaHoteles();
        this.taxis = new SistemaTaxis();
    }

    public void reservarViajeCompleto() {
        vuelos.reservarVuelo();
        hoteles.reservarHotel();
        taxis.reservarTaxi();
    }
}
