package com.arprocessor.psi;

import com.arprocessor.ArProcessorLanguage;
import com.intellij.psi.tree.IElementType;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorElementType extends IElementType {
    public ArProcessorElementType(String debugName) {
        super("", ArProcessorLanguage.INSTANCE);
    }
}
