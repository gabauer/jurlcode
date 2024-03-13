package de.tecbauer;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	private static boolean decode = false;

	public static void main(String[] args) {
		parseOptions(args);
		String input = readSTDIn();
		String output = decode
				? URLDecoder.decode(input, StandardCharsets.UTF_8)
				: URLEncoder.encode(input, StandardCharsets.UTF_8);
		System.out.println(output);
	}

	private static void parseOptions(String[] args) {
		if (args.length > 1) {
			System.err.println("Usage: jurlcode [-d]");
			System.err.println("       -d: decode mode");
			System.exit(1);
		}

		if (args.length == 1) {
			if ("-d".equals(args[0])) {
				decode = true;
			} else {
				System.err.println("Unknown option: " + args[0]);
				System.err.println("Usage: jurlcode [-d]");
				System.exit(1);
			}
		}
	}

	private static String readSTDIn() {
		StringBuilder sb = new StringBuilder();
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.isEmpty()) {
					break;
				}
				if (sb.length() > 0) {
					sb.append(System.lineSeparator());
				}
				sb.append(line);
			}
		}
		return sb.toString();
	}

}
