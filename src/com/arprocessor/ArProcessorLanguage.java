package com.arprocessor;

import com.intellij.lang.Language;

/**
 * Created by minoru on 01.10.15.
 */

public class ArProcessorLanguage extends Language {
    public static final ArProcessorLanguage INSTANCE = new ArProcessorLanguage();

    private ArProcessorLanguage() {
        super("ArProcessorLanguage");
    }
}
