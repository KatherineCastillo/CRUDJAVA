package Entidades;

public class Transporte {
    private int id;
    private String tipo;
    private String origen;
    private String destino;

    public Transporte() {
    }
    public Transporte(int id, String tipo, String origen, String destino) {
        this.id = id;
        this.tipo = tipo;
        this.origen = origen;
        this.destino = destino;
    }

    public Transporte(String tipo, String origen, String destino) {
        this.tipo = tipo;
        this.origen = origen;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
