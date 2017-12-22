package org.glavo.viewer.nui;

import javafx.application.Application;
import javafx.stage.Stage;
import lombok.Getter;

import java.awt.*;

public final class Main extends Application {
    private static final String TITLE = "ClassViewer";

    private static Command globalCommand;

    private static final int DEFAULT_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 7 * 4;
    private static final int DEFAULT_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 5 * 3;

    @Getter
    private final Command command;

    public static void main(String[] args) {
        globalCommand = new Command(args);
        Application.launch(Main.class, args);
    }

    public Main() {
        this.command = globalCommand;
    }

    public Main(String... args) {
        this.command = new Command(args);
    }

    public Main(Command command) {
        this.command = command;
    }

    @Override
    public void start(Stage stage) throws Exception {
    }
}
