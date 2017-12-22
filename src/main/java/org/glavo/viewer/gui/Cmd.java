package org.glavo.viewer.gui;

import java.util.Arrays;
import java.util.List;

public final class Cmd {
    public List<String> files;
    public boolean newGUI;

    public String[] parse(String[] args) {
        if (args.length >= 1 && args[0].equals("--nui")) {
            newGUI = true;
            files = Arrays.asList(args).subList(1, args.length);
        } else {
            files = Arrays.asList(args);
        }
        return new String[0];
    }
}
