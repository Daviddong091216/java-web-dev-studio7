package org.launchcode.studio7;

public class Main {

    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD();
        DVD dvd = new DVD();

        // TODO: Call each CD and DVD method to verify that they work as expected.
        Spinner newSpinner = new Spinner(cd);
        newSpinner.SpinThing();

        Spinner newSpinner2 = new Spinner(dvd);
        newSpinner2.SpinThing();

    }
}
