<<<<<<< HEAD:src/main/java/circus/equipment/Equipment.java
package circus.equipment;
=======
package circus.stuff;
>>>>>>> upstream/master:src/main/java/circus/stuff/Equipment.java

import circus.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
