package com.nishank.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnionFindTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		UnionFindTest ufTest = new UnionFindTest();
		File file = ufTest.readFile("tinyUF.txt");
		Scanner scanner = new Scanner(file);
		int siteSize = scanner.nextInt();
		System.out.println(siteSize);
		UnionFind uf = new UnionFind(siteSize);
		while (scanner.hasNextInt()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			uf.connect(p, q);
		}
		scanner.close();
		System.out.println(uf.count() + " Components");
	}
	
	private File readFile (String fileName) {
		return  new File(getClass().getClassLoader().getResource(fileName).getFile());
	
		
	}

}
