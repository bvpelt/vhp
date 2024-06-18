package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Intestines extends Organ {
    public Intestines() {

        setName("Intestines");
        setType("intestines");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
