package com.kike.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReaderClient {

	private LectorFichero lectorFichero = null;
	private String fileName = "res/myfile.txt";

	public DataReaderClient() throws FileNotFoundException {
		lectorFichero = new LectorFichero(fileName);
	}

	private String fetchData() throws IOException {
		return lectorFichero.read();
	}

	public static void main(String[] args) throws IOException {
		DataReaderClient dataReader = new DataReaderClient();
		System.out.println("Los datos son: " + dataReader.fetchData());
		
		
	}

}
