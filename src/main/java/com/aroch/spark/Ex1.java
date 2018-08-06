package com.aroch.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.checkArgument;

public class Ex1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Ex1.class);

    public static void main(String[] args) {
        checkArgument(args.length > 0, "Please provide the path of input file as first parameter.");
        new Ex1().run(args[0]);
    }

    public void run(String inputFilePath) {

        String master = "local[*]";

        SparkConf conf = new SparkConf()
                .setAppName(Ex1.class.getName())
                .setMaster(master);

        JavaSparkContext context = new JavaSparkContext(conf);

        SQLContext sqlContext = new SQLContext(context);

        // Implement Job
    }
}
