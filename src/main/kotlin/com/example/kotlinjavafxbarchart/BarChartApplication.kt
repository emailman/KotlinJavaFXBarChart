package com.example.kotlinjavafxbarchart

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.chart.BarChart
import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import javafx.scene.chart.XYChart
import javafx.scene.layout.Pane
import javafx.stage.Stage

class BarChartApplication : Application() {
    override fun start(stage: Stage) {
        // Create x-axis and y-axis
        val xAxis = CategoryAxis()
        val yAxis = NumberAxis()
        xAxis.label = "Manufacturer"
        yAxis.label = "Units Sold"

        // Create bar chart
        val barChart1 = BarChart(xAxis, yAxis)
        barChart1.title = "Car Sales by Manufacturer"

        // Create a few data series
        val dataSeries1 = XYChart.Series<String, Number>()
        dataSeries1.name = "January 2022"
        dataSeries1.data.add((XYChart.Data("Ford", 3500)))
        dataSeries1.data.add((XYChart.Data("GM", 4500)))
        dataSeries1.data.add((XYChart.Data("Toyota", 3000)))
        dataSeries1.data.add((XYChart.Data("Honda", 2000)))

        val dataSeries2 = XYChart.Series<String, Number>()
        dataSeries2.name = "February 2022"
        dataSeries2.data.add((XYChart.Data("Ford", 3575)))
        dataSeries2.data.add((XYChart.Data("GM", 4480)))
        dataSeries2.data.add((XYChart.Data("Toyota", 3040)))
        dataSeries2.data.add((XYChart.Data("Honda", 2100)))

        val dataSeries3 = XYChart.Series<String, Number>()
        dataSeries3.name = "March 2022"
        dataSeries3.data.add((XYChart.Data("Ford", 3520)))
        dataSeries3.data.add((XYChart.Data("GM", 4400)))
        dataSeries3.data.add((XYChart.Data("Toyota", 3100)))
        dataSeries3.data.add((XYChart.Data("Honda", 2200)))

        // Add the data series to the chart
        barChart1.data.addAll(dataSeries1, dataSeries2, dataSeries3)

        // Create a pane and add the bar chart to it
        val pane = Pane()
        pane.children.add(barChart1)

        // Create a scene and add the pane to it
        val scene = Scene(pane, 500.0, 500.0)

        // Add the scene to the stage
        stage.title = "Bar Chart Demo"
        stage.scene = scene

        stage.show()
    }
}

fun main() {
    Application.launch(BarChartApplication::class.java)
}