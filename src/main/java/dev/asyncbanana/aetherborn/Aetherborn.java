package dev.asyncbanana.aetherborn;

import net.fabricmc.api.ModInitializer;
import dev.asyncbanana.aetherborn.conditions.AetherArmorCondition;

public class Aetherborn implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	// public static final Logger LOGGER = LogManager.getLogger("aetherborn");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		AetherArmorCondition.register();
	}
}
