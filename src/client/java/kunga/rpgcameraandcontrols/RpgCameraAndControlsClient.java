package kunga.rpgcameraandcontrols;

import kunga.rpgcameraandcontrols.input.Keybinds;
import kunga.rpgcameraandcontrols.config.RpgConfig;
import net.fabricmc.api.ClientModInitializer;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigManager;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class RpgCameraAndControlsClient implements ClientModInitializer {

    @Override
	public void onInitializeClient() {
        AutoConfig.register(RpgConfig.class, GsonConfigSerializer::new);
        Keybinds.register();
	}

}