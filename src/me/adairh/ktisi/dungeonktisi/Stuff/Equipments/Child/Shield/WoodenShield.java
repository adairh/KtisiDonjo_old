package me.adairh.ktisi.dungeonktisi.Stuff.Equipments.Child.Shield;

import me.adairh.ktisi.dungeonktisi.GameHandle;
import me.adairh.ktisi.dungeonktisi.Stats.StatsType;
import me.adairh.ktisi.dungeonktisi.Stuff.Equipments.EquipmentObject;
import me.adairh.ktisi.dungeonktisi.Stuff.Equipments.EquipmentType;

import java.util.HashMap;

public class WoodenShield extends EquipmentObject {

    private boolean identified;

    public WoodenShield(GameHandle handle) {
        super(handle);
        identified = true;
    }

    @Override
    public int getId() {
        return 41;
    }

    @Override
    public EquipmentType getType() {
        return EquipmentType.SHIELD;
    }

    @Override
    public EquipmentObject getEquipment() {
        return this;
    }

    @Override
    public String getText() {
        return "Khiên gỗ";
    }

    @Override
    public HashMap<StatsType, Integer> getStatsField() {
        HashMap<StatsType, Integer> statField = new HashMap<StatsType, Integer>();
        statField.put(StatsType.DEFENSE, 5);
        return statField;
    }

    @Override
    public boolean identified() {
        return identified;
    }

    @Override
    public void setIdentify(boolean identified) {
        this.identified = identified;
    }


}
