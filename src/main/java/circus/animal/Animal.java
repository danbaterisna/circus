package circus.animal;

import circus.Asset;

abstract public class Animal implements Asset {
    abstract public String speak();
    public int getValue() {
        return 5;
    }
}
