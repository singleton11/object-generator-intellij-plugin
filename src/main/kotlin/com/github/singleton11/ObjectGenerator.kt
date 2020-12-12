package com.github.singleton11

import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.psi.KtClass

class ObjectGenerator : PsiElementBaseIntentionAction(), IntentionAction {
    override fun getText(): String = "Copy object creation code to clipboard"

    override fun getFamilyName(): String = "Object generator"

    override fun isAvailable(project: Project, editor: Editor?, element: PsiElement): Boolean {
        val parent = element.parent ?: return false
        return parent is PsiClass || parent is KtClass
    }

    override fun invoke(project: Project, editor: Editor?, element: PsiElement) {
        throw NotImplementedError()
    }
}