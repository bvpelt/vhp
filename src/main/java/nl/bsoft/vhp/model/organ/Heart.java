package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Heart extends Organ {
    private int resthaertbeat_min = 60;   // average min heart rate in beats/minute for adult in rest
    private int resthaertbeat_max = 100;  // average max heart rate in beats/minute for adult in rest

    public Heart() {
        super.setName("Heart");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Heart heart = (Heart) o;
        return resthaertbeat_min == heart.resthaertbeat_min && resthaertbeat_max == heart.resthaertbeat_max;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resthaertbeat_min, resthaertbeat_max);
    }

    @Override
    public String toString() {
        return "Heart{" +
                "resthaertbeat_min=" + resthaertbeat_min +
                ", resthaertbeat_max=" + resthaertbeat_max +
                '}';
    }
}
