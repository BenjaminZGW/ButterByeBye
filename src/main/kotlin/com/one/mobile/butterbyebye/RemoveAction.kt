package com.one.mobile.butterbyebye

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class RemoveAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Entrance(e).run()
    }

    override fun update(e: AnActionEvent) {
        super.update(e)
        e.presentation.isEnabledAndVisible = true
    }
}