package kunga.rpgcameraandcontrols.integrations;

import me.shedaniel.autoconfig.AutoConfig;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import kunga.rpgcameraandcontrols.config.RpgConfig;

public class RpgModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(RpgConfig.class, parent).get();
    }
}