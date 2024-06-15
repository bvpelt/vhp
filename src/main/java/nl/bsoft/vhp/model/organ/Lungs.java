package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lungs extends Organ {
    public Lungs() {
        super.setName("Lungs");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
