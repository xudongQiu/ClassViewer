package org.glavo.viewer.gui;

import lombok.Getter;

public final class ViewerToolBar extends javafx.scene.control.ToolBar {
    @Getter
    private Viewer viewer;

    public ViewerToolBar(Viewer viewer) {
        super();
        this.viewer = viewer;
    }
}
