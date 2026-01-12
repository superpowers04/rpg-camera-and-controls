package kunga.rpgcameraandcontrols.model;

import kunga.rpgcameraandcontrols.config.RpgConfig;
import kunga.rpgcameraandcontrols.input.RpgPlayerInput;
import net.minecraft.util.math.MathHelper;

public final class PlayerHead {
    private static final double MAX_YAW_DEG = 32.0;

    private static float currentYawRadiant = 0.0F;

    public static void update(double deltaSeconds) {
        var turnSpeedInDegreesPerSecond = RpgPlayerInput.getTurnSpeedInDegreesPerSecond();
        var normalizeSpeed = MathHelper.clamp(
            turnSpeedInDegreesPerSecond / RpgConfig.turn_speed_per_sec,
            -1.0,
            1.0
        );
        var targetYawRadiant = Math.toRadians(MAX_YAW_DEG) * normalizeSpeed;
        var alpha = 1.0 - Math.exp(RpgConfig.smoothing_speed * -deltaSeconds);
        currentYawRadiant += (float) ((targetYawRadiant - currentYawRadiant) * alpha);
    }

    public static float getCurrentYawRadiant() {
        return currentYawRadiant;
    }
}
