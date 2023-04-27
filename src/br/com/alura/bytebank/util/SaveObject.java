package br.com.alura.bytebank.util;

public class SaveObject {
    private final Object[] REFERENCE_ACCOUNT;
    private int positionToBeOccupied;

    public SaveObject() {
        this.REFERENCE_ACCOUNT = new Object[10];
        this.positionToBeOccupied = 0;
    }

    public void addAccount(Object o) {
        this.REFERENCE_ACCOUNT[positionToBeOccupied] = o;
        this.positionToBeOccupied++;

    }

    public void deleteAccount(Object o) {
        this.REFERENCE_ACCOUNT[positionToBeOccupied] = o;
        this.positionToBeOccupied--;

    }

    public int getPositionToBeOccupied() {
        return this.positionToBeOccupied;
    }

    public Object getReferenceTheAccount(int getIndex) {
        return this.REFERENCE_ACCOUNT[getIndex];
    }
}