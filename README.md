# Flongout
A combination of flipper, pong and breakout for 1-2 players. Customizable keyboard and/or gamepad controls.

![Screenshot](https://raw.githubusercontent.com/mkforsb/flongout/main/doc/screenshot-game.png)

## Building
Flongout uses the Gradle build tool:

    ./gradlew build

## Running
At runtime the game requires LWJGL native libraries to be present on the Java library path. The repo includes
a set of (old) natives in [/libs/lwjgl-2.9.3/native](/libs/lwjgl-2.9.3/native) along with a simple script 
[/run-linux.sh](https://github.com/mkforsb/flongout/blob/main/run-linux.sh) for starting the game on Linux.