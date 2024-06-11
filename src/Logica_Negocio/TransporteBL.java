package Logica_Negocio;
import Acceso_Datos.TransporteDAO;
import Entidades.Transporte;

import java.util.ArrayList;
public class TransporteBL {
    private static TransporteDAO transDAO = new TransporteDAO();

    public ArrayList<Transporte> mostrar(){
        return transDAO.mostrar();
    }
    public int guardar(Transporte pTransporte){
        return transDAO.guardar(pTransporte);
    }
    public int eliminar(int pId){
        return transDAO.eliminar(pId);
    }
}
