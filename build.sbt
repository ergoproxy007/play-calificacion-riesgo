name := """play-calificacion-riesgo"""
organization := "com.ceiba.capacitacion"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
