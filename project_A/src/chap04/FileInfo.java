package chap04;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {
//		if(args.length != 1){
//			System.out.println("���� : java FileInfo �����̸�");
//			System.exit(0);
//		} // if end
		
		File f = new File("test.txt");
		if(f.exists()){ // ������ ������ ���
			System.out.println("length : "+ f.length());
			System.out.println("canRead :" + f.canRead());
			System.out.println("canWrite :" + f.canWrite());
			System.out.println("getAbsolutePath :" + f.getAbsolutePath());
			try{
				System.out.println("getCanonicalPath :" + f.getCanonicalPath());
			}catch(IOException e){
				System.out.println(e);
			}
			System.out.println("getName :" + f.getName());
			System.out.println("getParent :" + f.getParent());
			System.out.println("getPath :" + f.getPath());
			
		}
	} // main end
}
