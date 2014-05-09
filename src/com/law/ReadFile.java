package com.law;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	/**
	 * cat u.data | cut -f1,2,3 | tr "\\t" ","
	 * @throws IOException 
	 * 
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("data/douban.txt"));

		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();

	}

}