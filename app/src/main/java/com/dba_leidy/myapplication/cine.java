package com.dba_leidy.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DBA-Leidy on 5/12/2017.
 */

public class cine {

        String boton;
        int photoId;
        double latitud;
        double longitud;
        String titulo;

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public cine(String boton, int photoId, double latitud, double longitud, String titulo) {
        this.boton = boton;
        this.photoId = photoId;
        this.latitud = latitud;
        this.longitud = longitud;
        this.titulo = titulo;
    }
}
