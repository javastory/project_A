package chap04;

import java.io.*;

public class FileDelete {

	public static void main(String[] args) {
//		if(args.length != 1){
//			System.out.println("���� : java FileDelete �����̸�");
//			System.exit(0);
//		} // if end
		
		File f = new File("test.txt");
		if(f.exists()){
			boolean deleteflag = f.delete();
			if(deleteflag)
				System.out.println("���� ������ �����Ͽ����ϴ�.");
			else
				System.out.println("���� ������ �����Ͽ����ϴ�.");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}//main
}
