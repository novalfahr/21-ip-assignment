package ip.syssrc.string;

/**
 * Vocab
 *
 * Assignment 5.2
 *
 * @author H071211045 - Muhammad Sofyan Daud Pujas <gaero38@gmail.com>
 *
 */
public class Vocab {

    /**
     * Add 'un' prefixes to a word, e.g. happy -> unhappy
     *
     * @param word the word to be prefixed
     * @return string of prefixes word
     */
    public static String addPrefixUn(String word) {
        String prefixUn = new String("un");
        word = word.toLowerCase();

        if (!word.startsWith(prefixUn)) {
            word = prefixUn.concat(word);
        }
        return new String(word);
    }

    /**
     * Add prefix for each word of groups of vocabulary words
     *
     * @param prefix the prefix to be added to each word
     * @param groups the groups of vocabulary words to be prefixed
     * @return string in the form of: `prefix :: prefixword_1 :: prefixword_2 :: ...
     *         :: prefixword_n`
     */
    public static String prefixes(String prefix, String... groups) {
        String merged = "";
        String separator = new String(" :: ");

        for (int i = 0; i < groups.length; i++) {
            String element = groups[i];
            merged = merged.concat(prefix).concat(element);
            if (i >= groups.length - 1) {
                break;
            }
            merged = merged.concat(separator);
        }
        return new String(merged);
    }

    /**
     * Remove 'ness' suffix from a word
     *
     * @param word the words with suffix to be removed
     * @return string of word without 'ness' suffix
     */
    public static String removeSuffixNess(String word) {
        if (word.endsWith("ness")) {
            word = word.replaceAll("ness", "");
        }
        if (word.endsWith("i")) {
            word = word.replace(word.charAt((word.length() - 1)), 'y');
        }
        return new String(word);
    }

    /**
     * Extract an adjective from a sentence and turning it into a verb
     *
     * @param sentence the sentence to be used as vocabulary word
     * @param index    the position of adjective word inside the sentence, -1 means
     *                 last position
     * @return string of extracted adjective as a verb
     */
    public static String nounToVerb(String sentence, int index) {
        String[] parts = sentence.split(" ");

        if (index < 0) {
            index = parts.length + index;
        } else if (index > parts.length - 1) { // Improved condition
            index = Math.abs(parts.length - index);
        }

        if (parts[index].endsWith(".")) {
            parts[index] = parts[index].replace(".", "");
        }
        if (!parts[index].endsWith("en")) {
            parts[index] = parts[index].concat("en");
        }
        return parts[index];
    }
}