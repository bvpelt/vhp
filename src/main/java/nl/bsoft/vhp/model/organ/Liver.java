package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Liver extends Organ {
    public Liver() {

        setName("Liver");
        setType("liver");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
