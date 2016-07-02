package tk.avabin.characters;

import tk.avabin.Inventory;
import tk.avabin.abilities.Abillity;
import tk.avabin.characters.Character;
import tk.avabin.origins.Origin;
import tk.avabin.professions.Profession;
import tk.avabin.specializations.Specialization;
import tk.avabin.tricks.Trick;

import java.util.ArrayList;

/**
 * Created by Avabin on 30.05.2016.
 */
public class Player extends Character {
    public Player(Origin origin, Profession profession, Specialization specialization, ArrayList<Abillity> abillities, ArrayList<Trick> tricks, Inventory inventory, int[] attributes) {
        super(origin, profession, specialization, abillities, tricks, inventory, attributes);
    }

    @Override
    public boolean isPlayable() {
        return true;
    }
}
