package chap03;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		System.out.println("Ű����� ���� �Է� ���� ���ڿ� :" + line);
	}
}
