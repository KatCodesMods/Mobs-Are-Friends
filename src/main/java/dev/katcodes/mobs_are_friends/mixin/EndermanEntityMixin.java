package dev.katcodes.mobs_are_friends.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.mob.EndermanEntity;

@Mixin(EndermanEntity.class)
public abstract class EndermanEntityMixin {

	@Inject(method = "isPlayerStaring", at = @org.spongepowered.asm.mixin.injection.At("HEAD"), cancellable = true)
	public void inject(CallbackInfoReturnable<Boolean> ci) {
		ci.setReturnValue(false);
	}

}
