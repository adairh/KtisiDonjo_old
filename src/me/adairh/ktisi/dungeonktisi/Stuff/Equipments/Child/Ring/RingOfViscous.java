package me.adairh.ktisi.dungeonktisi.Stuff.Equipments.Child.Ring;

import me.adairh.ktisi.dungeonktisi.GameHandle;
import me.adairh.ktisi.dungeonktisi.Stats.StatsType;
import me.adairh.ktisi.dungeonktisi.Stuff.Equipments.EquipmentObject;
import me.adairh.ktisi.dungeonktisi.Stuff.Equipments.EquipmentType;

import java.util.HashMap;

public class RingOfViscous extends EquipmentObject {
    private boolean identified;

    public RingOfViscous(GameHandle handle) {
        super(handle);
        identified = false;
    }

    @Override
    public int getId() {
        return 12;
    }

    @Override
    public String getText() {
        return "Nhẫn lời nguyền nhếch nhác";
    }

    @Override
    public HashMap<StatsType, Integer> getStatsField() {
        HashMap<StatsType, Integer> statsField = new HashMap<StatsType, Integer>();
        statsField.put(StatsType.DEXTERITY, -5);
        return statsField;
    }

    @Override
    public boolean identified() {
        return identified;
    }

    @Override
    public void setIdentify(boolean identified) {
        this.identified = identified;
    }

    @Override
    public EquipmentType getType() {
        return EquipmentType.RING;
    }

    @Override
    public EquipmentObject getEquipment() {
        return this;
    }
}
