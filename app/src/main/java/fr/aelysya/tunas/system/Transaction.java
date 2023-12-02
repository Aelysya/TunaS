package fr.aelysya.tunas.system;

public class Transaction {
    public String intitule;
    public Categorie categorie;
    public float montant;
    public String descriptionLongue;

    public Transaction(String intitule, Categorie categorie, float montant, String descriptionLongue){
        this.intitule = intitule;
        this.categorie = categorie;
        this.montant = montant;
        this.descriptionLongue = descriptionLongue;
    }
}
