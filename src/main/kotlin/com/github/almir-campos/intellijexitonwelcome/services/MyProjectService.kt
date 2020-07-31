package com.github.almir-campos.intellijexitonwelcome.services

import com.intellij.openapi.project.Project
import com.github.almir-campos.intellijexitonwelcome.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
