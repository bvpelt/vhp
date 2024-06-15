package nl.bsoft.vhp.model.gland;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.organ.Organ;

@Getter
@Setter
public class Pancreas extends Gland {
    public Pancreas() {
        super.setName("Pancreas");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
