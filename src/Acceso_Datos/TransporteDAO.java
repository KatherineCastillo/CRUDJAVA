package Acceso_Datos;
import Entidades.Transporte;
import java.sql.*;
import java.util.ArrayList;
public class TransporteDAO {
    PreparedStatement ps;
    ResultSet rs;
    Transporte trans;
    Conexion cn = new Conexion();

    public Connection getConexion ()throws ClassNotFoundException,
            SQLException{
        Class.forName(cn.getDriver());
        return DriverManager.getConnection(cn.getUrl(),cn.getUser(),cn.getPass());
    }
    public ArrayList<Transporte> mostrar(){
        ArrayList<Transporte> listTrans = new ArrayList<>();
        try{
            ps = getConexion().prepareStatement("select* from transporte");
            rs=ps.executeQuery();
            while (rs.next()){
                trans = new Transporte(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                listTrans.add(trans);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listTrans;
    }
    public int guardar (Transporte pTransporte){
        int result = 0;
        try{
            ps = getConexion().prepareStatement("INSERT INTO "+ "transporte(tipo,origen,destino) values (?,?,?)");
            ps.setString(1, pTransporte.getTipo());
            ps.setString(2, pTransporte.getOrigen());
            ps.setString(3,pTransporte.getDestino());
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return result;
    }
    public int eliminar (int  pId) {
        int result = 0;
        try {
            ps = getConexion().prepareStatement("DELETE from transporte " + "where id = ?");
            ps.setInt(1,pId);
            result = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;
    }
}
