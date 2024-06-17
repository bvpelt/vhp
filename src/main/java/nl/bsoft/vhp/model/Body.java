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
public class Body {
    private Long identification;
    private String kind;
    private Set<Organ> organSet = new HashSet<Organ>();
    private Skeleton skeleton;
    private Muscles muscles;

    public Body() {
        Random r = new Random();
        this.identification = r.nextLong();
        skeleton = new Skeleton();
        muscles = new Muscles();
        // Organs
        Brain brain = new Brain();
        brain.setBody(this);
        organSet.add(brain);
        organSet.add(new Heart());
        organSet.add(new Intestines());
        organSet.add(new Kidneys());
        organSet.add(new Liver());
        organSet.add(new Lungs());
        organSet.add(new Skin());
        organSet.add(new Stomach());
        // Glands
        organSet.add(new Adrenal());
        organSet.add(new Pancreas());
        organSet.add(new Parathyroid());
        organSet.add(new Pineal());
        organSet.add(new Pituitary());
        organSet.add(new Thymus());
        organSet.add(new Thyroid());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return Objects.equals(identification, body.identification) && Objects.equals(kind, body.kind) && Objects.equals(organSet, body.organSet) && Objects.equals(skeleton, body.skeleton) && Objects.equals(muscles, body.muscles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, kind, organSet, skeleton, muscles);
    }

    @Override
    public String toString() {
        return "Body{" +
                "identification=" + identification +
                ", kind='" + kind + '\'' +
                ", organSet=" + organSet +
                ", skeleton=" + skeleton +
                ", muscles=" + muscles +
                '}';
    }
}
