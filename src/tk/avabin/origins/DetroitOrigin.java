package tk.avabin.origins;

/**
 * Created by Avabin on 02.07.2016.
 */
public class DetroitOrigin extends Origin {
    public DetroitOrigin() {
        attributeTrait = "Dexterity";
        traits.add(new OriginTrait("If it has engine, it will move"));
        traits.add(new OriginTrait("Put through the hoops"));
        traits.add(new OriginTrait("What a drive!"));
    }
}
