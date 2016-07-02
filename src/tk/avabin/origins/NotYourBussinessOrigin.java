package tk.avabin.origins;

/**
 * Created by Avabin on 02.07.2016.
 */
public class NotYourBussinessOrigin extends Origin {
    public NotYourBussinessOrigin() {
        attributeTrait = "ANY";
        traits.add(new OriginTrait("Versality"));
        traits.add(new OriginTrait("Versality squared"));
    }
}
