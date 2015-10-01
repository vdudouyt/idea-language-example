package com.arprocessor;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorLexerAdapter extends FlexAdapter {
    public ArProcessorLexerAdapter() {
        super(new ArProcessorLexer((Reader) null));
    }
}
