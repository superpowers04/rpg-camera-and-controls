package kunga.rpgcameraandcontrols.config;

import me.shedaniel.autoconfig.annotation.*;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.option.Perspective;


@Config(name = "rpg-camera")
public class RpgConfig implements ConfigData {
	@ConfigEntry.BoundedDiscrete(max=9999)
    public static double TURN_SPEED_PER_SEC = 180;
	@ConfigEntry.BoundedDiscrete(min=0,max=10)
    public static double SMOOTHING_SPEED = 10.0;
    public static boolean AUTO_CENTER = true;
    public static Perspective PERSPECTIVE = Perspective.THIRD_PERSON_BACK;

}