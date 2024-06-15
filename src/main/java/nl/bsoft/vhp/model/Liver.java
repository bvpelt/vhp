package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Liver extends Organ {
    public Liver() {
        super.setName("Liver");
    }
}
