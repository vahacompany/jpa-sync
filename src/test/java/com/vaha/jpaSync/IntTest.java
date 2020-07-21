package com.vaha.jpaSync;

import java.nio.charset.StandardCharsets;

public class IntTest {

	public static void main(String[] args) {
		IntTest intTest = new IntTest();

		// intTest.numRangeCheck();
		// intTest.asciiChange();
		// intTest.charToByte();
//		intTest.intToByteArray();
		intTest.byteArrayToInt();
//		
//		intTest.byte2Int();
//		intTest.long2Bytes();
		
		int Val=32767;
		String Hex=Integer.toHexString(Val);
		System.out.println("-32768----> " + Hex);
		
		int n = 32767;
		String hexStr = Integer.toString(n, 16); // n을 16진수 스트링으로 변환
		System.out.printf("0x%s",hexStr); // 변환된 16진수 문자열을 출력

	}

	private void numRangeCheck() {
		long chkData = 999999999999999999L;

		int chkInt = 999999999;

		float chkFloat = 100.23f;

		System.out.println(chkData);
		System.out.println(chkInt);
		System.out.println(chkFloat);
	}

	private void numChangeByte() {
		byte[] aaa = { 0x00, 0x00, 0x04, 0x57 };

		System.out.println("byte[0x31]---> " + aaa.toString());
	}

	private void asciiChange() {
		// 문자를 아스키 코드 (10진수) 로 변환 출력
		System.out.println("A ---> " + (int) 'A'); // 65

		// 문자를 유니코드 코드 (10진수) 로 변환 출력
		System.out.println("가---> " + (int) '가'); // 44032

		// 문자를 아스키 코드 (16진수) 로 변환 출력
		System.out.format("0x%02X%n", (int) 'A'); // 0x41

		// 문자를 유니코드 코드 (16진수) 로 변환 출력
		System.out.format("0x%04X%n", (int) '가'); // 0xAC00

		// 코드 번호를 문자로 변환 출력
		System.out.println("(char) 65---> " + (char) 65); // A
		System.out.println("(char) 0x41---> " + (char) 0x41); // A (이것은 16진수로 'A'를 출력한 예제)

		// 코드 번호를 문자로 변환 출력 (한글)
		System.out.println("(char) 0xAC00---> " + (char) 0xAC00); // 가
		System.out.println("(char) 0xAD00---> " + (char) 0xAC01); // 가
	}

	private void charToByte() {
		String example = "This is raw text!";
		byte[] bytes = example.getBytes();

		System.out.println("Text : " + example);
		System.out.println("Text [Byte Format] : " + bytes);
		// no, don't do this, it returns the address of the object in memory
		System.out.println("Text [Byte Format] : " + bytes.toString());

		// convert bytes[] to string
		String s = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("Output : " + s);

		// UnsupportedEncodingException
		// String s = new String(bytes, "UTF_8");
	}

	public void intToByteArray() {
		byte[] byteArray = new byte[4];

		int value = 1;

		byteArray[0] = (byte) (value >> 24);
		byteArray[1] = (byte) (value >> 16);
		byteArray[2] = (byte) (value >> 8);
		byteArray[3] = (byte) (value);

		System.out.println("byteArray[0]--->" + (byteArray[0] & 0xff));
		System.out.println("byteArray[1]--->" + byteArray[1]);
		System.out.println("byteArray[2]--->" + byteArray[2]);
		System.out.println("byteArray[3]--->" + byteArray[3]);
	}

	public void byteArrayToInt() {
		byte bytes[] = { 0x00, 0x00, 0x01, 0x16 };
		// byte bytes[] = { 0, 0, 1, 16 };

		int aaa = ((((int) bytes[0] & 0xff) << 24) | (((int) bytes[1] & 0xff) << 16) | (((int) bytes[2] & 0xff) << 8)
				| (((int) bytes[3] & 0xff)));

		System.out.println("{0x00, 0x00, 0x04, 0x57}--->" + aaa);
	}

	public void byte2Int() {
		
		byte[] src = { 0x00, 0x00, 0x01, 0x78 };
		
		int s1 = src[0] & 0xFF;
		int s2 = src[1] & 0xFF;
		int s3 = src[2] & 0xFF;
		int s4 = src[3] & 0xFF;

		System.out.println(((s1 << 24) + (s2 << 16) + (s3 << 8) + (s4 << 0)));
	}

	public void long2Bytes() {
		byte[] buf = new byte[8];
		
		long l = 11111111;
		
		buf[0] = (byte) ((l >>> 56) & 0xFF);
		buf[1] = (byte) ((l >>> 48) & 0xFF);
		buf[2] = (byte) ((l >>> 40) & 0xFF);
		buf[3] = (byte) ((l >>> 32) & 0xFF);
		buf[4] = (byte) ((l >>> 24) & 0xFF);
		buf[5] = (byte) ((l >>> 16) & 0xFF);
		buf[6] = (byte) ((l >>> 8) & 0xFF);
		buf[7] = (byte) ((l >>> 0) & 0xFF);

		System.out.println(buf);
	}
}
