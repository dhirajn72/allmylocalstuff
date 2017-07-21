package com.java.test.singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Demo implements Serializable
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String s1;
	transient String s2;
	String city;
	public static void main(String[] args) throws Exception
	{
		doSerialize();
		doDeserialize();
	}
	private static void doSerialize() throws Exception
	{
		Demo d1=new Demo();
		Demo.s1="abc";
		d1.s2="JDBC";
		d1.city="Bangalore";
		FileOutputStream fos=new FileOutputStream("test.tx");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		out.writeObject(d1);
		System.out.println(d1);
		System.out.println("Successfully serialized");
		out.close();
	}
	private static void doDeserialize() throws Exception
	{
		FileInputStream fos=new FileInputStream("test.tx");
		ObjectInputStream out=new ObjectInputStream(fos);
		Demo d1=(Demo)out.readObject();
		
		System.out.println("Successfully deserialized");
		System.out.println(d1);
		//System.out.println(d1.s1+""+d1.s2+""+d1.city);
		
		out.close();
	}
	public String toString()
	{
		return "s1="+s1+" s2="+s2+" city="+city;
	}
}
