package nl.bsoft.vhp.model.organ.gland;

import lombok.Getter;
import lombok.Setter;

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
