package chap04;

import java.io.*;

public class TempFile {

	public static void main(String[] args) {
		try {
			File f = File.createTempFile("tmp_", ".dat");
			System.out.println("60�� ���� �����ֽ��ϴ�.");
			f.deleteOnExit(); // JVM�� ����� �� �ӽ������� �ڵ����� �����Ѵ�.
			try {
				Thread.sleep(60000);// 60�� ���� ���α׷��� �����ִ´�.
			} catch (InterruptedException e1) {
				System.out.println(e1);
			} 
			
		} catch (IOException e) {
			System.out.println(e);
		}
	} // main
}
