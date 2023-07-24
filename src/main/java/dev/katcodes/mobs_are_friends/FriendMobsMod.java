package dev.katcodes.mobs_are_friends;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.entity_events.api.ServerEntityLoadEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.mob.warden.WardenEntity;

public class FriendMobsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Friend Mobs Mod");

	@Override
	public void onInitialize(ModContainer mod) {
	}
}
