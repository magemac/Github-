package java0426;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex1 {
	
	
	public static void listDirectory(File dir) {
		if (dir.isFile()) {
			return;
		}
		
		System.out.println();
		System.out.println("----- " + dir.getPath() + "의 서브 리스트 입니다. -----");
		
		// 디렉토리에 포함된 파일과 디렉토리 정보 리스트 얻기
		File[] files = dir.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		
		for (int i=0; i<files.length; i++) {
			File f = files[i]; // 파일 또는 디렉토리
			
			Date date = new Date(f.lastModified());
			String strDate = sdf.format(date);
			
			String dirOrFile = "";
			if (f.isDirectory()) {
				dirOrFile = "<DIR>";
			} else {
				dirOrFile = "     ";
			}
			
			long fileSize = f.length(); // 바이트 크기
			String fileName = f.getName(); // 파일 또는 디렉토리 이름
	
			System.out.printf("%s\t%s\t%d\t%s\n", strDate, dirOrFile, fileSize, fileName);
		} // for
		
	} // listDirectory
	

	public static void main(String[] args) {
		// File 클래스 : 파일 또는 디렉토리 정보를 가지는 클래스
		
		File file1 = new File("C:\\devtools\\temp\\text.txt");
		
		System.out.println(file1.getPath()); // C:\devtools\temp\text.txt
		System.out.println(file1.getParent()); // C:\devtools\temp
		System.out.println(file1.getName()); // text.txt
		
		String result = "";
		if (file1.isFile()) {
			result = "파일";
		} else if(file1.isDirectory()) {
			result = "디렉토리";
		}
		System.out.println(file1.getPath() + "은 " + result + " 입니다.");
		
		// 새로 만들고자 하는 디렉토리명을 파일 객체로 준비
		File file2 = new File("C:/devtools/temp/javasample");
		
		if (!file2.exists()) { // 해당 폴더명이 존재하지 않으면 폴더 생성
			file2.mkdir(); // 하위폴더 한개를 만들때 사용
			// file2.mkdirs(); // 하위폴더들을 여러개 만들어야할때 사용
		}
		
		// temp 경로 안의 정보를 목록 형식으로 출력 
		listDirectory(new File("C:/devtools/temp"));
		
		// 파일 또는 디렉토리 이름 변경
		file2.renameTo(new File("C:/devtools/temp/자바_샘플"));
		
		// temp 경로 안의 정보를 목록 형식으로 출력 
		listDirectory(new File("C:/devtools/temp"));
	} // main

}





