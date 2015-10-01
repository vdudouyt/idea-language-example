package com.arprocessor;

import com.intellij.openapi.fileTypes.LanguageFileType;

import javax.swing.*;

/**
 * Created by minoru on 01.10.15.
 */

public class ArProcessorFileType extends LanguageFileType {
    public static final ArProcessorFileType INSTANCE = new ArProcessorFileType();

    private ArProcessorFileType() {
        super(ArProcessorLanguage.INSTANCE);
    }

    public Icon getIcon() {
        return null;
    }

    @Override
    public String getDefaultExtension() {
        return "ar";
    }

    public String getDescription() {
        return "Arithmetic Processor";
    }

    public String getName() {
        return "ArProcessor";
    }
}