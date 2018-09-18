
package models;

public class ModelRfc {
    private String apellido_p = "ISLAS";
    private String apellido_m = "YAÑEZ";
    private String nombres = "YANET";
    private int anio = 97;
    private String mes = "Octubre";
    private String dia = "";
    private String rfc= "oo";
    int contador;

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void calcular(){
   
          rfc = apellido_p.substring(0, 2) + apellido_m.charAt(0) + nombres.charAt(0) + anio + mes + dia;
     }
}
    



