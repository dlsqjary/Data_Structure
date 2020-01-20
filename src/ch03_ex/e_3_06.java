package ch03_ex;

import java.util.Arrays;
import java.util.Scanner;

public class e_3_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("찾고자 하는 키워드를 입력하세요: ");
		String key = sc.next();
		// Java에서 사용하는 키워드입니다.
		String[] x = {
				"abstract",   "assert",       "boolean",   "break",      "byte",
				"case",       "catch",        "char",      "class",      "const",
				"continue",   "default",      "do",        "double",     "else",
				"enum",       "extends",      "final",     "finally",    "float",
				"for",        "goto",         "if",        "implements", "import",
				"instanceof", "int",          "interface", "long",       "native",
				"new",        "package",      "private",   "protected",  "public",
				"return",     "short",        "static",    "strictfp",   "super",
				"switch",     "synchronized", "this",      "throw",      "throws",
				"transient",  "try",          "void",      "volatile",   "while"
		};
		int idx = Arrays.binarySearch(x, key);

		if(idx<0) {
			System.out.println("해당 키워드가 없습니다");
		} else {
			System.out.println("해당키워드는 x[" + idx + "] 에 있습니다");
		}
	}
}
