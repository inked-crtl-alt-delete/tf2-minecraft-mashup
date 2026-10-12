package com.inkedcrtlaltdelete.tf2minecraft;

import java.util.ArrayList;
import java.util.List;

public class MercDefinition {
    private final String id;
    private final String name;
    private final String className;
    private final List<String> weapons;
    private final List<String> cosmetics;

    public MercDefinition(String id, String name, String className, List<String> weapons, List<String> cosmetics) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.weapons = new ArrayList<>(weapons);
        this.cosmetics = new ArrayList<>(cosmetics);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public List<String> getWeapons() {
        return new ArrayList<>(weapons);
    }

    public List<String> getCosmetics() {
        return new ArrayList<>(cosmetics);
    }
}
