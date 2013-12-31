package wizardrymodteam;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import wizardrymodteam.item.WGemItem;
import wizardrymodteam.item.WSwordItem;
import wizardrymodteam.item.WAxeItem;
import wizardrymodteam.item.WPickaxeItem;
import wizardrymodteam.item.WHoeItem;
import wizardrymodteam.item.WShovelItem;

public class WItems {
	// Gems
	public static Item neonGem;

	// Tools
	public static Item neonSword;
	public static Item neonPickaxe;
	public static Item neonAxe;
	public static Item neonShovel;
	public static Item neonHoe;

	// ToolMaterials
	public static ToolMaterial toolMaterialNeon = EnumHelper.addToolMaterial(
			"neon", 3, 2453, 10.0F, 3.0F, 25);

	public static void addItems() {
		neonGem = new WGemItem().setUnlocalizedName("wizardrymod:neongem");
		neonSword = new WSwordItem(toolMaterialNeon)
				.setUnlocalizedName("wizardrymod:neonsword");
		neonPickaxe = new WPickaxeItem(toolMaterialNeon)
				.setUnlocalizedName("wizardrymod:neonpickaxe");
		neonAxe = new WAxeItem(toolMaterialNeon)
				.setUnlocalizedName("wizardrymod:neonaxe");
		neonShovel = new WShovelItem(toolMaterialNeon)
				.setUnlocalizedName("wizardrymod:neonshovel");
		neonHoe = new WHoeItem(toolMaterialNeon)
				.setUnlocalizedName("wizardrymod:neonhoe");
	}
}
