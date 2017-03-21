package dj.ekogui.test.ejercicio4;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Autocomplete {

	public String[] getSuggestions(String query) throws Exception {

		List<String> words = new ArrayList<String>();

		URL url = getClass().getResource("nouns.txt");
		List<String> lines = FileUtils.readLines(new File(url.getPath()), "utf-8");

		for (String word : lines) {
			// Buscar coincidencias de acuerdo al patron: query%, para
			// encontrar las palabras que comienzan con el patron de busqueda
			if (word.indexOf(query) != -1 && word.indexOf(query) == 0)
				words.add(word);
		}

		String[] resp = new String[words.size()];

		int pos = 0;
		for (String word : words) {
			resp[pos] = word;
			pos++;
		}

		return resp;
	}
}
