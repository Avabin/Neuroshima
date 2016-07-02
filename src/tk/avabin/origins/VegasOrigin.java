package tk.avabin.origins;

/**
 * Created by Avabin on 02.07.2016.
 */
public class VegasOrigin extends Origin {

    public VegasOrigin() {
        attributeTrait = "Dexterity";
        traits.add(new OriginTrait("Luck"));
        traits.add(new OriginTrait("Gambling man"));
        traits.add(new OriginTrait("Telepatist"));
    }
}
