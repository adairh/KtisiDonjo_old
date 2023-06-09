package me.adairh.ktisi.dungeonktisi.Stuff.Equipments.Child.Ring;

import me.adairh.ktisi.dungeonktisi.GameHandle;
import me.adairh.ktisi.dungeonktisi.Stats.StatsType;
import me.adairh.ktisi.dungeonktisi.Stuff.Equipments.EquipmentObject;
import me.adairh.ktisi.dungeonktisi.Stuff.Equipments.EquipmentType;

import java.util.HashMap;

public class RingOfTheWeak extends EquipmentObject {
    private boolean identified;

    public RingOfTheWeak(GameHandle handle) {
        super(handle);
        identified = false;
    }

    @Override
    public int getId() {
        return 14;
    }

    @Override
    public String getText() {
        return "Nhẫn lời nguyền yếu đuối";
    }

    @Override
    public HashMap<StatsType, Integer> getStatsField() {
        HashMap<StatsType, Integer> statsField = new HashMap<StatsType, Integer>();
        statsField.put(StatsType.STRENGTH, -5);
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
