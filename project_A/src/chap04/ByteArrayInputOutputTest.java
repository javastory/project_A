package chap04;

import java.io.*;

public class ByteArrayInputOutputTest {

	public static void main(String[] args) {
		// if(args.length != 1){
		// System.out.println("���� : java ByteArrayInputOutputTest �����̸�");
		// System.exit(0);
		// } // if end
		//
		FileInputStream fis = null;
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = null;		
		try{
			fis = new FileInputStream("test.txt");
			baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[512];
			int readcount = 0;
			// ���Ϸ� ���� �о���� byte�迭�� ByteArrayOutputStream���� ����.
			while((readcount = fis.read(buffer)) != -1){
				baos.write(buffer, 0, readcount);	
			}
			
			
			// ByteArrayOutputStream�� ���� ��������� ����� ����Ʈ �迭�� ��ȯ�Ѵ�.
			byte[] fileArray = baos.toByteArray();
			System.out.println("������ ������ ��� �о�鿩 byte[]�� ��������ϴ�.");
			System.out.println("�о���� byte�� �� :" + fileArray.length);
			
			// byte[]�� ���� �о���̴� ByteArrayInputStrem�� �����Ѵ�.
			bais = new ByteArrayInputStream(fileArray);
			// ByteArrayInputStream�� ���Ͽ� �о���� byte�迭�� ǥ�� ��� ��ġ(�����)
			// �� ����Ѵ�.
			while((readcount = bais.read(buffer)) != -1){
				System.out.write(buffer, 0, readcount);	
			}
			System.out.println("\n\n");
			System.out.println("�о���� ������ ��� ����Ͽ����ϴ�.");			
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			try{
				fis.close();
				bais.close();
				baos.close();
			}catch(IOException ioe){
				System.out.println(ioe);
			}
		}
	}
}
