package Lab7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyWordCount {
	public static final String fileName = "data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() throws IOException {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<WordCount> getWordCounts() {
		List<WordCount> result = new ArrayList<WordCount>();
		for (String str : words) {
			int count = 0;
			for (String str2 : words) {
				if (str.equals(str2)) {
					count++;
				}
			}
			WordCount current = new WordCount(str, count);
			if (!result.contains(current)) {
				result.add(current);
			}
		}
		return result;
	}

	public Set<String> getUniqueWords() {
		List<WordCount> getWordCounts = getWordCounts();
		Set<String> result = new HashSet<String>();
		for (WordCount word : getWordCounts) {
			if (word.getCount() == 1) {
				result.add(word.getWord());
			}
		}
		return result;
	}

	public Set<String> getDistinctWords() {
		Set<String> result = new HashSet<>(words);
		return result;
	}

	public Set<WordCount> printWordCounts() {
		Set<WordCount> result = new HashSet<>(getWordCounts());
		for (WordCount word : result) {
			System.out.print(word.toString() + ", ");
		}
		System.out.println();
		return result;
	}

	public Set<WordCount> exportWordCounts() {
		Set<WordCount> result = new TreeSet<>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				return o1.getWord().compareTo(o2.getWord());
			}

		});
		result.addAll(getWordCounts());
		for (WordCount word : result) {
			System.out.print(word.toString() + ", ");
		}
		System.out.println();
		return result;
	}

	public Set<WordCount> exportWordCountsOrderByOccurence() {
		Set<WordCount> result = new TreeSet<>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				if ((o2.getCount() - o1.getCount()) == 0) {
					return o1.getWord().compareTo(o2.getWord());
				}
				return o2.getCount() - o1.getCount();
			}

		});
		result.addAll(getWordCounts());
		for (WordCount word : result) {
			System.out.print(word.toString() + ", ");
		}
		System.out.println();
		return result;
	}

	public Set<WordCount> filterWords(String pattern) {
		List<WordCount> wordCounts = getWordCounts();
		Set<WordCount> result = new HashSet<WordCount>();
		for (WordCount str : wordCounts) {
			int check = str.getWord().indexOf(pattern.charAt(0));
			if (check == -1) {
				result.add(str);
			} else {
				for (int i = 1; i < Math.min(str.getWord().length(), pattern.length()); i++) {
					if (str.getWord().charAt(i) != pattern.charAt(i)) {
						result.add(str);
						break;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		MyWordCount test = new MyWordCount();

		System.out.println(test.getWordCounts());
		System.out.println(test.getUniqueWords());
		System.out.println(test.getDistinctWords());
		test.printWordCounts();
		test.exportWordCounts();
		test.exportWordCountsOrderByOccurence();
		System.out.println(test.filterWords("ho"));

	}
}
