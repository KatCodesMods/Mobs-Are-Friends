package dev.katcodes.mobs_are_friends.mixin;

import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dev.katcodes.mobs_are_friends.FriendMobsMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.mob.warden.WardenBrain;
import net.minecraft.entity.mob.warden.WardenEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.listener.GameEventListener;

@Mixin(WardenBrain.class)
public abstract class WardenBrainMixin {

	@Inject(method = "<clinit>", at = @org.spongepowered.asm.mixin.injection.At("TAIL"))
	private static void inject(CallbackInfo ci) {
		FriendMobsMod.LOGGER.info("WardenEntitySensorMixin");
		FriendMobsMod.LOGGER.info(Integer.toString(getSensors().size()));
		getSensors().clear();
		getSensors().add(0,SensorType.DUMMY);

	}


	@Accessor("SENSORS")
	public static List<SensorType<? extends Sensor<? super WardenEntity>>> getSensors() {
		throw new AssertionError();
	}
}
