package crawl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ImgParser {//<img src="https://tv.pstatic.net
	public String crawling(String MovieName){
    
		try{
			String title=MovieName;
			String result ="";
			for(int i=0;i<title.length();i++){
				result = result +unicodeEscaped(title.charAt(i));
			}
			//example.com�� �������� ����ϱ� ���� �������̴�. ������ �������� �ҽ��ڵ��� �絵 ����.
			String urlstr = "http://www.cgv.co.kr/search/default.aspx?query="+result;
			//URL ���ڿ��� ó���ϱ� ���� URLŬ������ �̿��Ѵ�.
			URL url = new URL(urlstr);
  
			//�ҽ��ڵ带 �������� ���� ��Ʈ���� �����Ѵ�.
			BufferedReader bf;
			String line = new String();
       
			//URLŬ������ openStream()�Լ��� ������ ���ּ��� �ҽ��ڵ带 �޾ƿ� �� �ִ�.
			bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			   
			
			while((line=bf.readLine())!=null){
				if((line.contains("http://img.cgv.co.kr/Movie/Thumbnail/Poster/")&&(line.contains("alt")))
						||((line.contains("http://contents.cgv.co.kr/Upload")&&line.contains("alt")))){

					String imgUrl = line.substring(line.indexOf("http://"),line.indexOf("alt")-2);
					return imgUrl;
				}
			}                            
			bf.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
			return "NULL";
		}
		return "NULL";
	}
	public static String unicodeEscaped(Character ch) {
		if (ch == null) 
			return null;
		
		return unicodeEscaped(ch.charValue());
	}
	private static String unicodeEscaped(char ch) {
		if (ch < 0x10) {
			return "%u000" + Integer.toHexString(ch);
		}
		else if (ch < 0x100) {
			return "%u00" + Integer.toHexString(ch);
		}
		else if (ch < 0x1000) {
			return "%u0" + Integer.toHexString(ch);
		}
		return "%u" + Integer.toHexString(ch);
	}
}
   
   
   
   
   