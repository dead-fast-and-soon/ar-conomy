package org.hyperfresh.arconomy.bukkit;

import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;

import org.hyperfresh.arconomy.vault.VaultEconomy;

import org.bukkit.Server;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {

	private static final Logger log = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {

		if(checkVault()) {
			log.info("[ar-econ] Found Vault! Registering economy service...");
			// register our economy class as service provider
			getServer().getServicesManager().register(Economy.class, new VaultEconomy(), this, ServicePriority.Normal);
		}

	}

	@Override
	public void onDisable() {

	}

	public boolean checkVault() {
		if(getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		return true;
	}
}
