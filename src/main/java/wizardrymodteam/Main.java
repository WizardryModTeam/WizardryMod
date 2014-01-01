package wizardrymodteam;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "wizardrymod", name = "Wizardry Mod", version = "v1")
public class Main {

	@EventHandler
	public void Load(FMLPreInitializationEvent event) {
		System.out.println("test");
		WItems.addItems();
	}

}
