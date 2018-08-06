# Spark Java Interview

## Exercise 1

In this exercise you're requested to solve a problem where records event time is different than processing time.
Files were written into folders by their processing time. You've been asked to sort the events by their event time and 
write them back in the following folder structure: `year=<YEAR>/month=<MONTH>/day=<DAY>`.

 ### Expected Output
 
 * Files are placed in their correct folder (by event time) in specified folder structure: `year=<YEAR>/month=<MONTH>/day=<DAY>`
 * Each daily folder contains <b> 1 file ONLY </b>
 * Each file's records is sorted by their time in ascending order
 * The 'time' column in the output file should be as a timestamp data type (e.g: `2018-08-06T17:40:20.000+03:00`)

### Steps
 * Implement the missing pieces
 * Compile: `mvn clean compile` 
 * Run the job: `mvn exec:java -Dexec.mainClass=com.aroch.spark.Ex1 -Dexec.args="src/main/resources/Ex1"`
 
### Notes
 * If you're on Windows and encounter this Exception: `java.io.IOException: Could not locate executable null\bin\winutils.exe in the Hadoop binaries.` <br>
   take a look [here](https://stackoverflow.com/questions/35652665/java-io-ioexception-could-not-locate-executable-null-bin-winutils-exe-in-the-ha). 