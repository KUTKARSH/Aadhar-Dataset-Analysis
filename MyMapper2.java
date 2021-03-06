package AadharCardAnalysis;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper2 extends Mapper<LongWritable,Text,Text,Text> {

protected void map(LongWritable key, Text value,
		Mapper<LongWritable, Text, Text, Text>.Context op)
		throws IOException, InterruptedException {
	String s = value.toString();
	String[] arr = s.split("[,]");
	String cityName = arr[1];
	String accepted = arr[2];
	String rejected = arr[3];
	String sum = accepted+" "+rejected;
	op.write(new Text(cityName),new Text(sum));
   }
}


