package com.filehandling.demo;

import java.io.File;
import java.io.IOException;

public class CreteFile {
	public static void main(String[] args) {

		File f = new File("C:\\FileHnadling\\prasad.doc");

		try {

			if (f.createNewFile()) {

				System.out.println("File Successfully created...");

			} else {

				System.out.println("FIle Already exists");
			}
		}

		catch (IOException e) {
		}

		System.out.println("Exception Handeled....!");

	}

}
