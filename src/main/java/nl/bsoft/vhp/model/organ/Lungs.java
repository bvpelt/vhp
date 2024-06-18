package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lungs extends Organ {
    public Lungs() {
        setName("Lungs");
        setType("lungs");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
