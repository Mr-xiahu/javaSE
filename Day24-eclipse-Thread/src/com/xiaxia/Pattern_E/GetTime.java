package com.xiaxia.Pattern_E;

public abstract class GetTime {
	public long getTime() {
		long start = System.currentTimeMillis();
		// forѭ��
		// for (int x = 1; x < 100000; x++) {
		// System.out.println(x);
		// }

		// ��Ƶ
		// try {
		// BufferedInputStream bis = new BufferedInputStream(
		// new FileInputStream("a.avi"));
		// BufferedOutputStream bos = new BufferedOutputStream(
		// new FileOutputStream("b.avi"));
		// byte[] bys = new byte[1024];
		// int len = 0;
		// while ((len = bis.read(bys)) != -1) {
		// bos.write(bys, 0, len);
		// }
		// bos.close();
		// bis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// �ٸ��Ҳ���һ�����룺���ϲ����ģ����̲߳���������API�����ĵȵ�...
		code();

		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();

}