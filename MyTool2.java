
package AadharCardAnalysis;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class MyTool2 {
	public static void main(String[] args)throws Exception
	{
		Configuration cfg = new Configuration();
		Job j = new Job(cfg);
		j.setJarByClass(MyTool2.class);
		FileInputFormat.addInputPath(j,new Path(args[0]));
		FileOutputFormat.setOutputPath(j,new Path(args[1]));
		j.setMapperClass(MyMapper2.class);
		j.setReducerClass(MyReducer2.class);
		j.setOutputKeyClass(Text.class);  //mapper's
		j.setOutputValueClass(Text.class);  //mapepr's
		j.setInputFormatClass(TextInputFormat.class);
		j.setOutputFormatClass(TextOutputFormat.class);
		j.waitForCompletion(true);
	}
	
}
