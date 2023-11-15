package com.radicalize.app.model;


import java.util.ArrayList;

public class Categoria {

    private ArrayList<Categoria> categoria;

    public Categoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }

    public Categoria(){}
    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }
}
