package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

//import org.apache.spark.sql.Dataset;
//import org.apache.spark.sql.Row;
//import org.apache.spark.sql.SQLContext;
//import org.apache.spark.sql.SparkSession;

interface Rideable { String getGait(); }

class HumptyDumpty{
     void myMethod() {}
}

class HankyPanky extends HumptyDumpty{
     protected void myMethod() {}
 }

class Person{
Person(String s,int i ){
      ++pid;
      name=s;
      age=i;
      }
    static int pid;
    int age;
    String name;
}

class Feline {
	public String type = "f ";

	public Feline() {
		System.out.print("feline ");
	}
}

class Cougar extends Feline {

	public Cougar() {

		System.out.print("cougar ");
	}

	void go() {

		type = "c ";
		System.out.print(this.type + super.type);
	}

	public static void main(String[] args) {
		new Cougar().go();
	}
}


class Camel implements Rideable {
	int weight = 2;

	public String getGait() {
		return " mph, lope";
	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}

	public static void main(String[] args) {
		new Camel().go(8);
	}
}

class Calculator {
	 int num = 100;
	 public void calc(int num) {
	 this.num = num * 10;
	 }
	 public void printNum(){
	 System.out.println(num);
	 }
	 /*public static void main(String[] args) {
	 
	 }*/
}

class Parent{

}


class MyClass1 {
	void myMethod(int i) {
		System.out.println(i);
	}

	void myMethod(String s) {
		System.out.println("String version");
	}

	/*public static void main(String args[]) {
		
	}*/
}

public class Oops extends Parent implements Cloneable, Serializable{
	
	String test = "test";
	
	private void demoMethod(){
		
	}
	
	public Oops() {
		System.out.println("Oops default constructor...");
	}
	
	public Oops(String test) {
		System.out.println("Oops default constructor...");
		this.test = test;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws Exception {		
		
		//classForNameExample();
		//cloningExample();
		//serializationExample();
		//deserializationExample();
		xlsConnector();
		
		//Calculator obj = new Calculator ();
		//obj.calc(2);
		//obj.printNum();
		
		/*List p = new ArrayList();
		 p.add(7);
		 p.add(1);
		 p.add(5);
		 p.add(1);
		 p.remove((Integer)5);
		 System.out.println(p);*/
		
		/*int a[][] = new int[3][];
		 a[1] = new int[5];
		 a[1][4]=8;
		 a[2] = new int[] {4, 5};
		System.out.println(a[1][4]);*/
		
		/*MyClass1 obj = new MyClass1();
		char ch = 'c' + 'd';
		obj.myMethod(ch);*/
		
		java.util.List d = new java.util.Stack();
		
		String data = "1";
		data = "2";
				
		
	}

	
	public static void xlsConnector() {
		//SparkSession sparkSession = SparkSession
				//.builder()
				//.appName("Java Spark SQL basic example")
				//.config("spark.master", "local")
				//.getOrCreate();

		
		//SQLContext sqlContext =  sparkSession.sqlContext().newSession();
		/*Dataset<Row> d = sqlContext.read()
				.format("com.crealytics.spark.excel")
			    .option("sheetName", "People") // Required
			    .option("useHeader", "true") // Required
			    .option("treatEmptyValuesAsNulls", "false") // Optional, default: true
			    .option("inferSchema", "false") // Optional, default: false
			    //.option("addColorColumns", "true") // Optional, default: false
			    //.option("startColumn", 0) // Optional, default: 0
			    //.option("endColumn", 99) // Optional, default: Int.MaxValue
			    //.option("timestampFormat", "MM-dd-yyyy HH:mm:ss") // Optional, default: yyyy-mm-dd hh:mm:ss[.fffffffff]
			    //.option("maxRowsInMemory", 20) // Optional, default None. If set, uses a streaming reader which can help with big files
			    //.option("excerptSize", 10) // Optional, default: 10. If set and if schema inferred, number of rows to infer schema from
			    //.schema(myCustomSchema) // Optional, default: Either inferred schema, or all columns are Strings
			    .option("location", "/home/jay/Downloads/")
			    .load("/home/jay/Downloads/");
		
		d.show(100, false);*/
		
		ArrayList<String> filePath = new ArrayList<>();
		//filePath.add("/home/jay/Downloads/Untitled Folder/*/*.xls*");
		//filePath.add("/home/jay/Desktop/test2/test3.xls");
		//filePath.add("/home/jay/Downloads/Untitled Folder/*.xls*");
		filePath.add("/home/jay/Desktop/EJBI/test/XLS/*");
		
		String[] paths = filePath.toArray(new String[filePath.size()]);
		
		//Dataset<Row> dataset = sqlContext.read()
		//.format("org.zuinnote.spark.office.excel")
		//.option("read.sheets", "Orders1")
		//.option("read.spark.simpleMode","true")
		//.option("read.spark.useHeader", "true")
		//.option("read.locale.bcp47", "us")
		//.option("read.lowFootprint", "true")
		//.option("hadoopoffice.read.security.crypt.password", "")
		//.option("hadoopoffice.read.linkedworkbooks", "true")
		//.option("hadoopoffice.read.ignoremissinglinkedworkbooks", "true")
		//.option("hadoopoffice.mapreduce.output.fileoutputformat.compress", "false")
		//.load(paths);//.limit(100);

		//dataset.show(100000000, false);
		
		//System.out.println("exporting data now");
		//d.write().option("header", "true").csv("/home/jay/Desktop/Sample1xls2");
	}
	
	public static void deserializationExample() {
		try {
			
			FileInputStream fileInputStream = new FileInputStream("text.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Oops oops = (Oops) objectInputStream.readObject();
			System.out.println("Readed : " + oops.test);
			objectInputStream.close();
			fileInputStream.close();
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void serializationExample() {
		Oops oops = new Oops("hrelldsd");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(oops);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void cloningExample() {
		Oops oops = new Oops();
		try {
			Oops oops2 = (Oops) oops.clone();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void classForNameExample() {
		
		try {
			Class class1 = Class.forName("com.test.Oops");
			Oops oops = (Oops)class1.newInstance();
			System.out.println("classForNameExample done");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}		
	}
	
	int a = 10;
	
	public static void vectorDemo() {
		int a = 11;
		Vector<String> vector = new Vector<>();
		vector.add("vectorString1");
		
		//Get the enumerator
		vector.elements();
	}
}
