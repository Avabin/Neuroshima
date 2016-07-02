package tk.avabin.origins;

/**
 * Created by Avabin on 02.07.2016.
 */
public class SandmanOrigin extends Origin {
    public SandmanOrigin() {
        attributeTrait = "Perception";
        traits.add(new OriginTrait("Companion"));
        traits.add(new OriginTrait("I am the Ghost of the Desert"));
        traits.add(new OriginTrait("I rely only on myself"));
    }
}
