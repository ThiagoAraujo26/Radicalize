package com.radicalize.app.model;

public class ServicoDisponivel {

    private String title;
    private String location;
    private String imageUrl;

    public ServicoDisponivel(String title, String location, String imageUrl) {
        this.title = title;
        this.location = location;
        this.imageUrl = imageUrl;
    }

    public ServicoDisponivel(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
