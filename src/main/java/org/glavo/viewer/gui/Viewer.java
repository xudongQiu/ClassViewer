package org.glavo.viewer.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.stage.Stage;
import lombok.Getter;
import org.glavo.viewer.gui.support.FontUtils;
import org.glavo.viewer.gui.support.ImageUtils;

import java.awt.*;
import java.io.File;

/**
 * ViewerApp class.
 */
public final class Viewer extends Application {

    private static final String TITLE = "ClassViewer";

    public static final int DEFAULT_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 7 * 4;
    public static final int DEFAULT_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 5 * 3;

    public static Cmd cmd = new Cmd();

    static {
        FontUtils.init();
    }

    public static void main(String[] args) {
        args = cmd.parse(args);
        launch(Viewer.class, args);
    }

    @Getter
    private Stage stage;

    @Getter
    private ViewerPane pane;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        pane = new ViewerPane(this);
        Scene scene = new Scene(pane, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        scene.getStylesheets().add("editor.css");
        enableDragAndDrop(scene);

        stage.setScene(scene);
        stage.setTitle(TITLE);
        stage.getIcons().add(ImageUtils.loadImage("/icons/spy16.png"));
        stage.getIcons().add(ImageUtils.loadImage("/icons/spy32.png"));

        stage.show();
    }

    private void enableDragAndDrop(Scene scene) {
        scene.setOnDragOver(event -> {
            Dragboard db = event.getDragboard();
            if (db.hasFiles()) {
                event.acceptTransferModes(TransferMode.COPY);
            } else {
                event.consume();
            }
        });

        // Dropping over surface
        scene.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();
            boolean success = false;
            if (db.hasFiles()) {
                success = true;
                for (File file : db.getFiles()) {
                    //System.out.println(file.getAbsolutePath());
                    //todo openFile(file);
                }
            }
            event.setDropCompleted(success);
            event.consume();
        });
    }

    public ViewerMenuBar getMenuBar() {
        return pane.getMenuBar();
    }

    public ViewerToolBar getToolBar() {
        return pane.getToolBar();
    }
}
