package com.inkedcrtlaltdelete.tf2minecraft;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class MercRegistry {
    private static final Map<String, MercDefinition> MERCS = new LinkedHashMap<>();

    static {
        register(new MercDefinition("scout", "Scout", "Scout",
                List.of("Scattergun", "Sidearm", "Bat"),
                List.of("Canteen Cap", "Blue Team Biker Helmet", "Hightops")));

        register(new MercDefinition("soldier", "Soldier", "Soldier",
                List.of("Rocket Launcher", "Shotgun", "Shovel"),
                List.of("Battered Buckshot", "Tyrant's Helm", "Loadout Boots")));

        register(new MercDefinition("pyro", "Pyro", "Pyro",
                List.of("Flame Thrower", "Shotgun", "Fire Axe"),
                List.of("Nostromo Napalmer", "Pyromancer's Mask", "Magma Boots")));

        register(new MercDefinition("demoman", "Demoman", "Demoman",
                List.of("Grenade Launcher", "Stickybomb Launcher", "Bottle"),
                List.of("Padded Helmet", "Voodoo Hood", "Battle Boots")));

        register(new MercDefinition("heavy", "Heavy", "Heavy",
                List.of("Minigun", "Shotgun", "Fists"),
                List.of("Russian Heavy Helmet", "KGB Bandana", "Steel Boots")));

        register(new MercDefinition("engineer", "Engineer", "Engineer",
                List.of("Shotgun", "Pistol", "Wrench"),
                List.of("Doomsday Device", "Hard Hat", "Utility Boots")));

        register(new MercDefinition("medic", "Medic", "Medic",
                List.of("Syringe Gun", "Medigun", "Bonesaw"),
                List.of("Surgical Helmet", "Doctor's Goggles", "Courier Boots")));

        register(new MercDefinition("sniper", "Sniper", "Sniper",
                List.of("Sniper Rifle", "SMG", "Kukri"),
                List.of("Rooftop Hat", "Sniper Mask", "Tread Boots")));

        register(new MercDefinition("spy", "Spy", "Spy",
                List.of("Revolver", "Sapper", "Knife"),
                List.of("Classic Fedora", "Spy Cowl", "Dress Boots")));
    }

    private MercRegistry() {
    }

    private static void register(MercDefinition merc) {
        MERCS.put(merc.getId(), merc);
    }

    public static Map<String, MercDefinition> getAllMercs() {
        return new LinkedHashMap<>(MERCS);
    }

    public static MercDefinition get(String id) {
        return MERCS.get(id);
    }

    public static List<String> getIds() {
        return new ArrayList<>(MERCS.keySet());
    }
}
