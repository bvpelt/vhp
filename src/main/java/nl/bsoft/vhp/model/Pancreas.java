package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pancreas extends Organ {
    public Pancreas() {
        super.setName("Pancreas");
    }
}
