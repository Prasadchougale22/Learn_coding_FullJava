package com.filehandling.demo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiledemo {

	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("C:\\FileHnadling\\Swami.txt");
			try {
				fr.write(" Shree Swami samarth");
			} finally {
				fr.close();
			} 

			System.out.println("File wrote sussessfully");
		}

		catch (IOException e) {

		}
	}

}
