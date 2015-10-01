package com.arprocessor;

import com.arprocessor.parser.ArProcessorParser;
import com.arprocessor.psi.ArProcessorFile;
import com.arprocessor.psi.ArProcessorTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.arprocessor.psi.ArProcessorFile;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(ArProcessorTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Language.<ArProcessorLanguage>findInstance(ArProcessorLanguage.class));

    @Override
    public Lexer createLexer(Project project) {
        return new ArProcessorLexerAdapter();
    }

    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new ArProcessorFile(viewProvider);
    }

    public PsiElement createElement(ASTNode node) {
        return ArProcessorTypes.Factory.createElement(node);
    }

    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiParser createParser(final Project project) {
        return new ArProcessorParser();
    }
}
