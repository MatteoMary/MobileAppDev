package org.setu.placemark.console.main

import mu.KotlinLogging
import org.setu.placemark.console.controllers.PlacemarkController

private val logger = KotlinLogging.logger {}
val controller = PlacemarkController()

fun main() {  
    PlacemarkController().start()

    var input: Int

    do {
        input = controller.menu()
        when(input) {
            1 -> controller.add()
            2 -> controller.update()
            3 -> controller.list()
            4 -> controller.search()
            -99 -> controller.dummyData()
            -1 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != -1)
    logger.info { "Shutting Down Placemark Console App" }
}
