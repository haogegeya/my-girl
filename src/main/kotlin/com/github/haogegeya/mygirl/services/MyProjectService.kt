package com.github.haogegeya.mygirl.services

import com.intellij.openapi.project.Project
import com.github.haogegeya.mygirl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
