package com.aki;

import com.almasb.fxgl.app.GameSettings;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {
    void initSettings(GameSettings settings) {
        settings.setWidth(600);
        settings.setHeight(600);
        settings.setTitle("Basic Game App");
        settings.setVersion("0.1");
    }
}
