package org.glavo.viewer.gui;

import javafx.scene.control.MenuBar;
import lombok.Getter;

public final class ViewerMenuBar extends MenuBar {
    @Getter
    private final Viewer viewer;


    public ViewerMenuBar(Viewer viewer) {
        this.viewer = viewer;
    }


}
