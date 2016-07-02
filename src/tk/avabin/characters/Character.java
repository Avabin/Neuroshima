package tk.avabin.characters;

import tk.avabin.Inventory;
import tk.avabin.abilities.Abillity;
import tk.avabin.origins.Origin;
import tk.avabin.professions.Profession;
import tk.avabin.specializations.Specialization;
import tk.avabin.tricks.Trick;

import java.util.ArrayList;

/**
 * Created by Avabin on 30.05.2016.
 */
public abstract class Character {
    private Origin origin;
    private Profession profession;
    private Specialization specialization;
    private ArrayList<Abillity> abillities;
    private ArrayList<Trick> tricks;
    private Inventory inventory;
    private int[] attributes = {6, 6, 6, 6, 6};

    public Character(Origin origin, Profession profession, Specialization specialization,
                     ArrayList<Abillity> abillities, ArrayList<Trick> tricks,
                     Inventory inventory, int[] attributes){
        this.origin = origin;
        this.profession = profession;
        this.specialization = specialization;
        this.abillities = abillities;
        this.tricks = tricks;
        this.inventory = inventory;
        this.attributes = attributes;


        String attributeTrait = this.origin.getAttributetrait();
        if (attributeTrait.equals("Strength")) {
            attributes[0] += 1;
        }
        if (attributeTrait.equals("Dexterity")) {
            attributes[1] += 1;
        }
        if (attributeTrait.equals("Perception")) {
            attributes[2] += 1;
        }
        if (attributeTrait.equals("Character")) {
            attributes[3] += 1;
        }
        if (attributeTrait.equals("Cunning")) {
            attributes[4] += 1;
        }
        else {
            // TODO choose atrrTrait
        }
    }

    public Origin getOrigin() {
        return origin;
    }

    public Profession getProfession() {
        return profession;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public ArrayList<Abillity> getAbillities() {
        return abillities;
    }

    public ArrayList<Trick> getTricks() {
        return tricks;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int[] getAttributes() {
        return attributes;
    }

    public abstract boolean isPlayable();
}
