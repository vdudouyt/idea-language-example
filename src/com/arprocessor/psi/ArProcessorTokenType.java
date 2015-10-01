package com.arprocessor.psi;

import com.arprocessor.ArProcessorLanguage;
import com.intellij.psi.tree.IElementType;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorTokenType extends IElementType {
    public ArProcessorTokenType(String debugName) {
        super(debugName, ArProcessorLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ArProcessorToken." + super.toString();
    }
}