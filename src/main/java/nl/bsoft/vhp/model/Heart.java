package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Heart extends Organ {
    public Heart() {
        super.setName("Heart");
    }
}
