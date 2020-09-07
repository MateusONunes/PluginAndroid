package com.github.mateusornelas.pluginandroid.services

import com.intellij.openapi.project.Project
import com.github.mateusornelas.pluginandroid.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
