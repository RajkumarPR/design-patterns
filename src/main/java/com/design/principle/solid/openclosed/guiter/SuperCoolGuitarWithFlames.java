package com.design.principle.solid.openclosed.guiter;

public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    public SuperCoolGuitarWithFlames() {
    }

    public SuperCoolGuitarWithFlames(String maker, String model, int volume, String flameColor){
        super(maker,model,volume);
        this.flameColor = flameColor;
    }
    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
