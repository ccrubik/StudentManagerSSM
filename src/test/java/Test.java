import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {

	public static void main(String[] args) {
		String url = "一二三四五六七";

		StringBuffer sb = new StringBuffer();
		char[] charArray = "一".toCharArray();
		for (char c : charArray) {
			sb.append("\\u" + Integer.toHexString(c));

		}
		System.out.println(sb);
		String[] split = "\\u4e00".split("\\\\u");

		for (String string : split) {
			
			if (!string.isEmpty()) {

				int parseInt = Integer.parseInt(string,16);
				sb.append((char) parseInt);
			}
		}
		System.out.println(sb);
		try {
			String encode = URLEncoder.encode(url, "utf-8");
			System.out.println(encode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
