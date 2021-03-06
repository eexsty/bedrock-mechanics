package gq.nkkx.bedrockmechanics.client.controller.input.handlers;

import gq.nkkx.bedrockmechanics.client.controller.input.ControllerButtonBinding.AccessibleEnvironment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;

public class EnvironmentMatcher {

    public boolean matches(MinecraftClient client, AccessibleEnvironment environment) {
        switch (environment) {
            case IN_GAME:
                return client.currentScreen == null;
            case INVENTORY:
                return client.currentScreen instanceof HandledScreen;
            case OTHER_MENUS:
                return client.currentScreen != null && !(client.currentScreen instanceof HandledScreen);
            default:
                return false;
        }
    }

}
