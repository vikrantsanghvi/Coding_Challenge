package Part2;
import java.io.*;
import java.util.*;

public class SingletonDemo {
	public static void main (String args[])throws IOException{
	Singleton obj= Singleton.getInstance();
	obj.printvalues();
	}
}
