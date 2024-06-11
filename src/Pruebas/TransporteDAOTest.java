package Pruebas;
import Entidades.Transporte;
import Logica_Negocio.TransporteBL;
import org.junit.jupiter.api.Order;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class TransporteDAOTest {
    @org.junit.jupiter.api.Test
    @Order(2)
    void mostrar() {
        TransporteBL transporteBL = new TransporteBL();
        ArrayList<Transporte> transportes = transporteBL.mostrar();
        assertNotNull(transportes,"La lista de transportes no debe ser nula");
        assertFalse(transportes.isEmpty(),"Lista no debe estar vacia");
    }

    @org.junit.jupiter.api.Test
    @Order(1)
    void guardar() {
        TransporteBL transporteBL = new TransporteBL();
        Transporte transporte = new Transporte( "Bus","Nose","R2345");
        int result = transporteBL.guardar(transporte);
        assertEquals(1,result,"Debe devolver 1");

    }
    @org.junit.jupiter.api.Test
    @Order(3)
    void eliminar() {
        TransporteBL transporteBL = new TransporteBL();
        int result = transporteBL.eliminar(1);
        assertEquals(1,result,"Deberia devolver 1");
    }


}
