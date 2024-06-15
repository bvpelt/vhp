package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lungs extends Organ {
    public Lungs() {
        super.setName("Lungs");
    }
}
