package com.blue.splash.utils;

import com.blue.splash.cnst.Flags;
import com.blue.splash.model.ConfigSplash;

public class ValidationUtil {

    public static int hasPath(ConfigSplash cs) {
        if (cs.getPathSplash().isEmpty())
            return Flags.WITH_LOGO;
        else
            return Flags.WITH_PATH;
    }
}
