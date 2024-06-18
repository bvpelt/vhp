package nl.bsoft.vhp.model.organ.gland;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pancreas extends Gland {
    public Pancreas() {
        setName("Pancreas");
        setType("pancreas");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
