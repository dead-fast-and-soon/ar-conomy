package org.hyperfresh.arconomy.bukkit;

import java.util.UUID;

import org.hyperfresh.arconomy.OfflinePlayer;

public class BukkitOfflinePlayer implements OfflinePlayer {

	private org.bukkit.OfflinePlayer handle;

	public BukkitOfflinePlayer(org.bukkit.OfflinePlayer handle) {
		this.handle = handle;
	}

	@Override
	public UUID getUUID() {
		return handle.getUniqueId();
	}

	@Override
	public String getName() {
		return handle.getName();
	}

}
