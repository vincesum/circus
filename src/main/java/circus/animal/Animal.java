package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {
    public String name;

    public abstract String speak();

    public static Comparator<Animal> AnimalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal a, Animal b) {
            return a.name.compareToIgnoreCase(b.name);
        }

    };
}
