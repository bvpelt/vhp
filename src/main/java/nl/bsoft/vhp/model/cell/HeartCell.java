package nl.bsoft.vhp.model.cell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeartCell extends Cell {

    public HeartCell() {
        super.setName("HeartCell");
        super.setType("heartcell");
    }
}
