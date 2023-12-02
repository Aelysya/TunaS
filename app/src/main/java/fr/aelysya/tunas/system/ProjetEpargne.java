package fr.aelysya.tunas.system;

import java.util.ArrayList;
import java.util.List;

public class ProjetEpargne {
    public String intitule;
    public float objectif;
    public float montantActuel;
    public List<Float> historiqueAjouts;
    public boolean estComplet;

    public ProjetEpargne(String intitule, float objectif){
        this.intitule = intitule;
        this.objectif = objectif;
        this.montantActuel = 0.0f;
        this.historiqueAjouts = new ArrayList<>();
        this.estComplet = false;
    }

    public void add(float montant){
        this.montantActuel += montant;
        this.historiqueAjouts.add(montant);

        this.estComplet = montantActuel >= objectif;
    }

    public float calcCompletion(){
        return (this.montantActuel * 100) / objectif;
    }
}
