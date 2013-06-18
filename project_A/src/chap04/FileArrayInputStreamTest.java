
package chap04;

import java.io.*;

public class FileArrayInputStreamTest {

	public static void print(InputStream in){
		byte[] buffer = new byte[512];
		int readcount = 0;
		
		try {
			while((readcount = in.read(buffer)) != -1){
				System.out.write(buffer, 0, readcount);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	} // print
	
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("���� : java FileArrayInputStreamTest file/array");
			System.exit(0);
		} // if end	
		
		if(args[0].equals("file")){	
			FileInputStream fis = null;
			try{
				fis = new FileInputStream("file.dat");
				// static �޼ҵ� print()ȣ��
				print(fis);
			}catch(Exception ex){
				System.out.println(ex);
			}finally{
				try {
					fis.close();
				} catch (IOException e) {}
			}
		}else if(args[0].equals("array")){
			byte[] abc = new byte[26];
			for(int i = 0; i < 26; i++){
				abc[i] = (byte)('a' + i);
			}
			ByteArrayInputStream bais = null;
			try{
				bais = new ByteArrayInputStream(abc);
				// static �޼ҵ� print()ȣ��
				print(bais);
			}catch(Exception ex){
				System.out.println(ex);
			}finally{
				try {
					bais.close();
				} catch (IOException e) {}
			}
		}else{
			System.out.println("���� : java FileArrayInputStreamTest file/array");
			System.exit(0);
		} // if
	} // main
}
