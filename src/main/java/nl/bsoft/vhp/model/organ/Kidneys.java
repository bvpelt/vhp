package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kidneys extends Organ {
    public Kidneys() {

        setName("Kidneys");
        setType("kidneys");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
