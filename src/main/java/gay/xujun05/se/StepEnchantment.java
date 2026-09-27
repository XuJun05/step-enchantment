package gay.xujun05.se;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepEnchantment implements ModInitializer {
	public static final String MOD_ID = "step-enchantment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ResourceKey<Enchantment> STEP = ResourceKey.create(
		Registries.ENCHANTMENT,
		id("step")
	);

	@Override
	public void onInitialize() {
		LOGGER.info("Step Enchantment Mod initialized!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
