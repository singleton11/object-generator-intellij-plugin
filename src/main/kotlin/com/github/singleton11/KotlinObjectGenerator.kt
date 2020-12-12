package com.github.singleton11

import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement

class KotlinObjectGenerator : ObjectGenerator() {
    override fun getText(): String = "Generate instantiation kotlin code to clipboard"

    override fun invoke(project: Project, editor: Editor?, element: PsiElement) {
        throw NotImplementedError()
    }
}