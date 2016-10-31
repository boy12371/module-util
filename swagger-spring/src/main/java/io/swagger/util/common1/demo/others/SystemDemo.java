package io.swagger.util.common1.demo.others;
public class SystemDemo {
	public static void main(String[] args) {
		String[] s = new String[] { "liu" };
		String[] s2 = new String[] { "hai" };
		String[][] a = { s, s2, s, s, s, s2, s2, s };
		String[][] b = new String[10][10];
		/*
		 * System�����һЩ���õ����ֶκͷ�������final��,�޷����̳�,���췽����private�����ܴ���System����
		 * ����public���Ժͷ�������final static
		 */
		// 1.���鸴�ƣ����ñ��ط������ƣ�ʵ�������
		System.arraycopy(a, 1, b, 0, 5);
		System.out.println(b[0][0]);
		// 2.�Ѿ���ȥ�ĺ���������1970-1-1��ʼ
		System.currentTimeMillis();
		// 3.��ʾ����������������գ�ͨ������Runtime.getRuntime().gc();ʵ��
		System.gc();
		// 4.����ϵͳ����
		System.getenv();
		// 5.���ص�ǰ��ϵͳ���ԡ�
		System.getProperties();
		// 6.�����Ӌ�����^ȥ�ĕr�g
		System.nanoTime();
		// 7.0��ʾ�����˳����{��Runtime.getRuntime().exit(0);
		System.exit(0);
		// 8.���ظ�������Ĺ�ϣ�룬�ô�����Ĭ�ϵķ��� hashCode() ���صĴ���һ�������۸�����������Ƿ���д hashCode()��
		System.identityHashCode(null);
	}
}
