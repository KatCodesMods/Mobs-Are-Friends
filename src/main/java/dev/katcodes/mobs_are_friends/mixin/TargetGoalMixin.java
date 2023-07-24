package dev.katcodes.mobs_are_friends.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.ai.goal.TargetGoal;

@Mixin(TargetGoal.class)
public  abstract class TargetGoalMixin {

	@Inject(method = "canStart", at = @At("HEAD"), cancellable = true)
	public void injected(CallbackInfoReturnable<Boolean> ci) {
		ci.setReturnValue(false);
	}
}
