package org.javierub.models;

public class Users {
    private int id;
    private String name;
    private String last_name_p;
    private String last_name_m;
    private String domicilio;
    private String telefono;
    private int sanctions;
    private int sanc_money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name_p() {
        return last_name_p;
    }

    public void setLast_name_p(String last_name_p) {
        this.last_name_p = last_name_p;
    }

    public String getLast_name_m() {
        return last_name_m;
    }

    public void setLast_name_m(String last_name_m) {
        this.last_name_m = last_name_m;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSanctions() {
        return sanctions;
    }

    public void setSanctions(int sanctions) {
        this.sanctions = sanctions;
    }

    public int getSanc_money() {
        return sanc_money;
    }

    public void setSanc_money(int sanc_money) {
        this.sanc_money = sanc_money;
    }


}
