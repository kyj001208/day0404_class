package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest01 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./test01.txt"); // 프로젝트파일에서 test01.txt 연결(통신)할 준비가 되었다는 의미.
		FileOutputStream fos=new FileOutputStream(file);  //통신을 해주는 담당을 한다.
		fos.write('a'); //파일을 확장하지 않았기에 바이트 기본으로 한글자씩만 넣을수 있다.
		fos.write('b');
		fos.write('c');
		fos.close();
		

	}

}
