package com.cespedesz07.secuenciaActividades;

import java.util.List;

public class InfoSecuenciaActividadesDTO {

    private SecuenciaActividades secuenciaActividades;
    private List<Integer> actividadesSeleccionadas;

    public SecuenciaActividades getSecuenciaActividades() {
        return secuenciaActividades;
    }

    public void setSecuenciaActividades(SecuenciaActividades secuenciaActividades) {
        this.secuenciaActividades = secuenciaActividades;
    }

    public List<Integer> getActividadesSeleccionadas() {
        return actividadesSeleccionadas;
    }

    public void setActividadesSeleccionadas(List<Integer> actividadesSeleccionadas) {
        this.actividadesSeleccionadas = actividadesSeleccionadas;
    }
}
