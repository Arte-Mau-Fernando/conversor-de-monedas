package com.aluralatam.conversordemonedas.historial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> listaDeOperaciaones = new ArrayList<>();

    public List<String> getListaDeOperaciaones() {
        return listaDeOperaciaones;
    }
    public void guardaHistorial (String operacion){
        this.getListaDeOperaciaones().add("Historial ["+ LocalDateTime.now()+"]   "+ operacion);
    }
    public List<String> mostrarHistorial (){
        return getListaDeOperaciaones();
    }

}
