package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.cell.Cell;
import nl.bsoft.vhp.model.cell.LymphCell;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Lymph extends BodyPart {

    private Set<Cell> cells = new HashSet<Cell>();
    public Lymph() {
        setName("Lymph");
        setType("lymph");
        cells.add(new LymphCell());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lymph lymph = (Lymph) o;
        return Objects.equals(cells, lymph.cells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cells);
    }

    @Override
    public String toString() {
        return "Lymph{" +
                "cells=" + cells +
                '}';
    }
}
