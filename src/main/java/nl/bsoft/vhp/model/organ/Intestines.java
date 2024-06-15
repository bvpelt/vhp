package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Intestines extends Organ {
    public Intestines() {
        super.setName("Intestines");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
