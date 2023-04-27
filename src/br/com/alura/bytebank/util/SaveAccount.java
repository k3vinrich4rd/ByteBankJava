package br.com.alura.bytebank.util;

import br.com.alura.bytebank.template.Account;

public class SaveAccount {
    private final Account[] REFERENCE_ACCOUNT;
    private int positionToBeOccupied;

    public SaveAccount() {
        this.REFERENCE_ACCOUNT = new Account[10];
        this.positionToBeOccupied = 0;
    }

    public void addAccount(Account account) {
        this.REFERENCE_ACCOUNT[positionToBeOccupied] = account;
        this.positionToBeOccupied++;

    }

    public void deleteAccount(Account account) {
        this.REFERENCE_ACCOUNT[positionToBeOccupied] = account;
        this.positionToBeOccupied--;

    }

    public int getPositionToBeOccupied() {
        return this.positionToBeOccupied;
    }

    public Account getReferenceTheAccount(int getIndex) {
        return this.REFERENCE_ACCOUNT[getIndex];
    }
}

