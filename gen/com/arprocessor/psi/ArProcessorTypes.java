// This is a generated file. Not intended for manual editing.
package com.arprocessor.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.arprocessor.psi.impl.*;

public interface ArProcessorTypes {

  IElementType PROPERTY = new ArProcessorElementType("PROPERTY");

  IElementType COMMENT = new ArProcessorTokenType("COMMENT");
  IElementType CRLF = new ArProcessorTokenType("CRLF");
  IElementType KEY = new ArProcessorTokenType("KEY");
  IElementType SEPARATOR = new ArProcessorTokenType("SEPARATOR");
  IElementType VALUE = new ArProcessorTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new ArProcessorPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
