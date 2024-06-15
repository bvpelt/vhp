package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Heart extends Organ {
    public Heart() {
        super.setName("Heart");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
