package com.kike.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorFichero {

	private StringBuilder builder = null;
	private Scanner scanner = null;

	public  LectorFichero(String fileName) throws FileNotFoundException {
	scanner = new Scanner(new File(fileName));
	builder= new StringBuilder();
	}

	public String read() {
		while (scanner.hasNext()) {
			builder.append(scanner.next());
		}
		return builder.toString();
	}

}
