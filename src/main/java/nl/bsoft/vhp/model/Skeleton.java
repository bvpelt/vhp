package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.organ.*;
import nl.bsoft.vhp.model.organ.gland.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
public class Skeleton {
    private String name;

    public Skeleton() {
        name = "skeleton";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skeleton skeleton = (Skeleton) o;
        return Objects.equals(name, skeleton.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Skeleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
