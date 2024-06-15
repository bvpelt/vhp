package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Brain extends Organ {
    public Brain() {
        super.setName("Brain");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
