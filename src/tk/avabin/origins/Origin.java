package tk.avabin.origins;

import java.util.ArrayList;

/**
 * Created by Avabin on 30.05.2016.
 */
public abstract class Origin {
    protected String attributeTrait;
    protected ArrayList<OriginTrait> traits = new ArrayList<OriginTrait>(3);

    public String getAttributetrait() {
        return this.attributeTrait;
    }

    public OriginTrait getTrait(int index) {
        return traits.get(index);
    }
}
