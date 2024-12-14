classes:
	mkdir -p class
	javac -cp junit-platform-console-standalone-1.9.3.jar -d class src/VLille/Main.java src/VLille/controlCenter/*.java src/VLille/Exceptions/*.java src/VLille/Station/*.java src/VLille/user/*.java src/VLille/vehicle/*.java src/VLille/vehicle/Bike/*.java src/VLille/vehicle/Bike/equipment/*.java test/VLille/vehicle/*.java test/VLille/vehicle/Bike/*.java test/VLille/vehicle/Bike/equipment/*.java test/VLille/Station/*.java test/VLille/user/*.java

all: 
	make clean
	make classes

clean:
	rm -rf class

run:
	java -classpath class src.VLille.Main

test: classes
	java -jar junit-platform-console-standalone-1.9.3.jar --class-path class --scan-class-path

docs:
	rm -rf docs
	mkdir -p docs
	javadoc -d docs src/VLille/controlCenter/*.java src/VLille/Exceptions/*.java src/VLille/Station/*.java src/VLille/user/*.java src/VLille/vehicle/*.java src/VLille/vehicle/Bike/*.java src/VLille/vehicle/Bike/equipment/*.java

.PHONY: docs