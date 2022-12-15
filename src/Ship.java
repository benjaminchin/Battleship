public class Ship {
    private boolean sunken;

    public Ship() {
        sunken = false;
    }

    public void sink() {
        sunken = true;
    }

    public boolean isSunk() {
        return sunken;
    }
}
