package com.inkedcrtlaltdelete.tf2minecraft;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerMercManager {
    private static final Map<UUID, String> selected = new ConcurrentHashMap<>();

    public static void setMerc(UUID playerUuid, String mercId) {
        selected.put(playerUuid, mercId);
        System.out.println("Player " + playerUuid + " selected merc " + mercId);
    }

    public static String getMerc(UUID playerUuid) {
        return selected.get(playerUuid);
    }
}
