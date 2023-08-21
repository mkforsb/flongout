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
Starting the game on other platforms should be similar:

    CLASSPATH="./build/libs/flongout.jar"
    CLASSPATH="$CLASSPATH:./libs/slick2d/lib/jinput.jar"
    CLASSPATH="$CLASSPATH:./libs/slick2d/lib/jogg-0.0.7.jar"
    CLASSPATH="$CLASSPATH:./libs/slick2d/lib/jorbis-0.0.15.jar"
    CLASSPATH="$CLASSPATH:./libs/slick2d/lib/lwjgl.jar"
    CLASSPATH="$CLASSPATH:./libs/slick2d/lib/slick.jar"

    java -Djava.library.path=./libs/lwjgl-2.9.3/native/PLATFORM -Dfile.encoding=UTF-8 -classpath $CLASSPATH flongout.Main
