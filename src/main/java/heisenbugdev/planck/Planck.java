package heisenbugdev.planck;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Planck.Data.ID, name = Planck.Data.NAME, version = "@VERSION@")
public class Planck {
	public static class Data {
		public static final String ID = "planck-framework";
		public static final String NAME = "Planck Framework";
		public static final Logger log = LogManager.getLogger("Planck");
	}
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Data.log.info("Pre-initialzing Planck.");
	}
	
}
