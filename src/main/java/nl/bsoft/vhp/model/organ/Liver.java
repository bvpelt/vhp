package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Liver extends Organ {
    public Liver() {
        super.setName("Liver");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
