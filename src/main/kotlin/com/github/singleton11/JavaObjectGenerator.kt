package com.github.singleton11

import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement

class JavaObjectGenerator : ObjectGenerator() {
    override fun getText(): String = "Generate instantiation java code to clipboard"

    override fun invoke(project: Project, editor: Editor?, element: PsiElement) {
        throw NotImplementedError()
    }
}