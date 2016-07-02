package tk.avabin.origins;

/**
 * Created by Avabin on 02.07.2016.
 */
public class PostOrigin extends Origin {
    public PostOrigin() {
        attributeTrait = "Cunning";
        traits.add(new OriginTrait("It works in simulation..."));
        traits.add(new OriginTrait("Hi-Tech"));
        traits.add(new OriginTrait("Moloch? I've heard something about it"));
    }
}
