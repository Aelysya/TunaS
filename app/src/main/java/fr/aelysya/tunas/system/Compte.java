package fr.aelysya.tunas.system;

import java.util.ArrayList;
import java.util.List;

public class Compte {
    public String intitule;
    public List<Transaction> transactions;

    public Compte(String intitule){
        this.intitule = intitule;
        this.transactions = new ArrayList<>();
    }
}
