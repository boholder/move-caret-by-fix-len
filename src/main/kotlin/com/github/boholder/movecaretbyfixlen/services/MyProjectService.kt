package com.github.boholder.movecaretbyfixlen.services

import com.intellij.openapi.project.Project
import com.github.boholder.movecaretbyfixlen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
