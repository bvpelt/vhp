package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pancreas extends Organ {
    public Pancreas() {
        super.setName("Pancreas");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
