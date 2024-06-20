package nl.bsoft.vhp.model.cell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LymphCell extends Cell {

    public LymphCell() {
        super.setName("LymphCell");
        super.setType("lymphcell");
    }
}
