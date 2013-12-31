package wizardrymodteam;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import wizardrymodteam.tools.WizardryNeonSword;

public class WizardryItems {
	// Gems

	// Tools
	public static Item neonAxe;

	// toolMaterials
	public static ToolMaterial toolMaterialNeon = EnumHelper
			.addToolMaterial("neon", 3, 2274, 10.0F, 3.0F, 25);

	public static void addItems() {
		neonAxe = new WizardryNeonSword(toolMaterialNeon).setUnlocalizedName("neonsword");
	}
}
