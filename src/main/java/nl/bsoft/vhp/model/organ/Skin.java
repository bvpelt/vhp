package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skin extends Organ {
    public Skin() {

        setName("Skin");
        setType("skin");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
