package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Brain extends Organ {
    public Brain() {
        super.setName("Brain");
    }
}
