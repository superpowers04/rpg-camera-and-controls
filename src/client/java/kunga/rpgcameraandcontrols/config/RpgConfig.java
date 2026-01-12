package kunga.rpgcameraandcontrols.config;

import me.shedaniel.autoconfig.annotation.*;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.option.Perspective;


@Config(name = "rpg-camera")
public class RpgConfig implements ConfigData {
    public static boolean enabled = true;
	@ConfigEntry.BoundedDiscrete(max=9999)
    public static double turn_speed_per_sec = 180;
	@ConfigEntry.BoundedDiscrete(min=0,max=10)
    public static double smoothing_speed = 10.0;
    public static boolean auto_center = true;
    // public static Perspective perspective = Perspective.THIRD_PERSON_BACK;

}