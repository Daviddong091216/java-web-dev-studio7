package org.launchcode.studio7;

public class Spinner {
    private ISpin spinnyThing;

    public Spinner(ISpin spinnyThing) {
        this.spinnyThing = spinnyThing;
    }

    public void SpinThing() {
        this.spinnyThing.Spin();
    }

}
