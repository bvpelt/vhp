package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Muscles {
    private String name;

    public Muscles() {
        name = "muscles";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Muscles skeleton = (Muscles) o;
        return Objects.equals(name, skeleton.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Muscles{" +
                "name='" + name + '\'' +
                '}';
    }
}
