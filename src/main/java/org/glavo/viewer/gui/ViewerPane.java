package org.glavo.viewer.gui;

import javafx.scene.layout.BorderPane;
import lombok.Getter;

public final class ViewerPane extends BorderPane {
    @Getter
    private Viewer viewer;
    @Getter
    private ViewerMenuBar menuBar;
    @Getter
    private ViewerToolBar toolBar;

    public ViewerPane(Viewer viewer) {
        this.viewer = viewer;
        menuBar = new ViewerMenuBar(viewer);
        toolBar = new ViewerToolBar(viewer);
    }
}
