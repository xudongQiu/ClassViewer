package org.glavo.viewer.gui;

import lombok.Getter;

import java.awt.*;

public final class ViewerMenuBar extends MenuBar {
    @Getter
    private final Viewer viewer;


    public ViewerMenuBar(Viewer viewer) {
        this.viewer = viewer;
    }


}
