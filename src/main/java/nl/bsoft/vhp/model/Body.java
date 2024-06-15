package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.gland.*;
import nl.bsoft.vhp.model.organ.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Body {
    private String kind;
    private Set<Organ> organSet = new HashSet<Organ>();

    public Body() {
        // Organs
        organSet.add(new Brain());
        organSet.add(new Heart());
        organSet.add(new Intestines());
        organSet.add(new Kidneys());
        organSet.add(new Liver());
        organSet.add(new Lungs());
        organSet.add(new Pancreas());
        organSet.add(new Skin());
        organSet.add(new Stomach());
        // Glands
        organSet.add(new Adrenal());
        organSet.add(new Parathyroid());
        organSet.add(new Pineal());
        organSet.add(new Pituitary());
        organSet.add(new Thymus());
        organSet.add(new Thyroid());
    }

    @Override
    public String toString() {
        return "Body{" +
                "kind='" + kind + '\'' +
                ", organSet=" + organSet +
                '}';
    }
}
