package me.blackfur.magicsdead.mixin;

import me.blackfur.magicsdead.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentTableBlock.class)
public class EnchantmentTableMixin {
    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    public void returnBeforeScreen(BlockState p_52974_, Level p_52975_, BlockPos p_52976_, Player p_52977_, InteractionHand p_52978_, BlockHitResult p_52979_, CallbackInfoReturnable<InteractionResult> cir) {
        if (Config.noMagic) {
            cir.setReturnValue(InteractionResult.PASS);
            cir.cancel();
        }
    }
}
