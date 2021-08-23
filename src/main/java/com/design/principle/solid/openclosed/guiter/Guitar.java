package com.design.principle.solid.openclosed.guiter;

/**
 * OPC states that "classes should be open for extension but closed for modification".
 * In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.
 *
 * Of course, the one exception to the rule is when fixing bugs in existing code.
 */
public class Guitar {

    private String make;
    private String model;
    private int volume;

    public Guitar() {
    }

    public Guitar(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
