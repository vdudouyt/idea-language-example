package com.arprocessor.psi;

import com.arprocessor.ArProcessorFileType;
import com.arprocessor.ArProcessorLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

/**
 * Created by minoru on 01.10.15.
 */
public class ArProcessorFile extends PsiFileBase {
    public ArProcessorFile(FileViewProvider viewProvider) {
        super(viewProvider, ArProcessorLanguage.INSTANCE);
    }

    @Override
    public FileType getFileType() {
        return ArProcessorFileType.INSTANCE;
    }
}
