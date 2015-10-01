package com.arprocessor;

import com.arprocessor.psi.ArProcessorTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEY = createTextAttributesKey("AR_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("AR_VALUE", DefaultLanguageHighlighterColors.STRING);

    public static final  TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    public static final  TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public Lexer getHighlightingLexer() {
        return new ArProcessorLexerAdapter();
    }

    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if(tokenType.equals(ArProcessorTypes.KEY)) {
            return KEY_KEYS;
        } else if(tokenType.equals(ArProcessorTypes.VALUE)) {
            return VALUE_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
