#!/bin/bash
CLASSPATH="./build/libs/flongout.jar"
CLASSPATH="$CLASSPATH:./libs/slick2d/lib/jinput.jar"
CLASSPATH="$CLASSPATH:./libs/slick2d/lib/jogg-0.0.7.jar"
CLASSPATH="$CLASSPATH:./libs/slick2d/lib/jorbis-0.0.15.jar"
CLASSPATH="$CLASSPATH:./libs/slick2d/lib/lwjgl.jar"
CLASSPATH="$CLASSPATH:./libs/slick2d/lib/slick.jar"

java -Djava.library.path=./libs/lwjgl-2.9.3/native/linux \
     -Dfile.encoding=UTF-8 \
     -classpath $CLASSPATH \
     flongout.Main
