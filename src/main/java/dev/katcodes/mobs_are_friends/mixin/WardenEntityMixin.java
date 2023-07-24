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

@Mixin(WardenEntity.class)
public abstract class WardenEntityMixin {

	@Inject(method = "isEnemy", at = @org.spongepowered.asm.mixin.injection.At("HEAD"), cancellable = true)
	private  void inject(@Nullable Entity entity, CallbackInfoReturnable<Boolean> ci) {
		FriendMobsMod.LOGGER.info("isEnemy");
		ci.setReturnValue(false);

	}

}
