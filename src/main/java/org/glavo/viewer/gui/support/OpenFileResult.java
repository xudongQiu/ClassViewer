package org.glavo.viewer.gui.support;

import org.glavo.viewer.FileComponent;
import org.glavo.viewer.gui.parsed.HexText;

import java.net.URL;

public class OpenFileResult {

    public final URL url;
    public final FileType fileType;
    public final FileComponent fileRootNode;
    public final HexText hexText;

    public OpenFileResult(URL url, FileType fileType) {
        this.url = url;
        this.fileType = fileType;
        this.fileRootNode = null;
        this.hexText = null;
    }

    public OpenFileResult(URL url, FileType fileType,
                          FileComponent fileRootNode, HexText hexText) {
        this.url = url;
        this.fileType = fileType;
        this.fileRootNode = fileRootNode;
        this.hexText = hexText;
    }

}
