package com.arprocessor.psi;

import com.arprocessor.ArProcessorLanguage;
import com.intellij.psi.tree.IElementType;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorTokenType extends IElementType {
    public ArProcessorTokenType(String debugName) {
        super("", ArProcessorLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType" + super.toString();
    }
}