package com.arprocessor;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(ArProcessorFileType.INSTANCE, "ArProcessor");
    }
}
