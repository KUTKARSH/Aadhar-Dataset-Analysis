package AadharCardAnalysis;

import java.io.IOException;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer2 extends Reducer<Text,Text,Text, IntWritable> {

protected void reduce(Text ik, Iterable<Text> iv,
		Reducer<Text, Text, Text,IntWritable>.Context op)
		throws IOException, InterruptedException {
	
    int sumAccepted = 0;
    int sumRejected = 0;
	for(Text i:iv)
	{
		String s = i.toString();
		String[] arr = s.split("[ ]");
		int accepted = Integer.parseInt(arr[0]);
		int rejected = Integer.parseInt(arr[1]);
		sumAccepted += accepted;
		sumRejected += rejected;
	}
	Text ok1 = new Text("Accepted by "+ik.toString());
	Text ok2 = new Text("Rejected by "+ik.toString());
	op.write(ok1,new IntWritable(sumAccepted));
	op.write(ok2,new IntWritable(sumRejected));
	
	
	
	}

}

