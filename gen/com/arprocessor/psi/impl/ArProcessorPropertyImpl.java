// This is a generated file. Not intended for manual editing.
package com.arprocessor.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.arprocessor.psi.ArProcessorTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.arprocessor.psi.*;

public class ArProcessorPropertyImpl extends ASTWrapperPsiElement implements ArProcessorProperty {

  public ArProcessorPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ArProcessorVisitor) ((ArProcessorVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
