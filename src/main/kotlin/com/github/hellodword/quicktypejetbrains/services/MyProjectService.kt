package com.github.hellodword.quicktypejetbrains.services

import com.github.hellodword.quicktypejetbrains.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
