package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Cellpart {
    private String name;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cellpart cellpart = (Cellpart) o;
        return Objects.equals(name, cellpart.name) && Objects.equals(type, cellpart.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Cellpart{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}