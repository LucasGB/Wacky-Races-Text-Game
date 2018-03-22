#!/bin/bash
kotlinc game.kt -include-runtime -d game.jar
java -jar game.jar
