package dj.ekogui.test.ejercicio4;

import org.junit.Assert;
import org.junit.Test;

public class AutocompleteTest {

    @Test
    public void getSuggestionsForQueryAbbotTest() {
        String query = "abbot";
        String[] expected = {
                "abbotship",
                "abbotships"
        };
        Autocomplete autocomplete = new Autocomplete();
        String[] suggestions = autocomplete.getSuggestions(query);
        Assert.assertEquals(expected.length, suggestions.length);
        Assert.assertArrayEquals(expected, suggestions);
    }

    @Test
    public void getSuggestionsForQuerySubjTest() {
        String query = "subj";
        String[] expected = {
                "subjection",
                "subjections",
                "subjoinder",
                "subjoinders",
                "subjunction",
                "subjunctive",
                "subjunctives"
        };
        Autocomplete autocomplete = new Autocomplete();
        String[] suggestions = autocomplete.getSuggestions(query);
        Assert.assertEquals(expected.length, suggestions.length);
        Assert.assertArrayEquals(expected, suggestions);
    }

    @Test
    public void getSuggestionsForQueryOrdersTest() {
        String query = "orders";
        String[] expected = {};
        Autocomplete autocomplete = new Autocomplete();
        String[] suggestions = autocomplete.getSuggestions(query);
        Assert.assertEquals(expected.length, suggestions.length);
        Assert.assertArrayEquals(expected, suggestions);
    }

    @Test
    public void getSuggestionsForQuerySuffeTest() {
        String query = "suffe";
        String[] expected = {
                "sufferance",
                "sufferer",
                "sufferers",
                "suffering",
                "sufferings"
        };
        Autocomplete autocomplete = new Autocomplete();
        String[] suggestions = autocomplete.getSuggestions(query);
        Assert.assertEquals(expected.length, suggestions.length);
        Assert.assertArrayEquals(expected, suggestions);
    }

    @Test
    public void getSuggestionsForQuerySuperTest() {
        String query = "super";
        String[] expected = {
                "superbness",
                "superbrain",
                "superclass",
                "superflux",
                "supergun",
                "superhet",
                "superhets",
                "superman",
                "superpraise",
                "superscript",
                "superscripts",
                "superstar",
                "superstars",
                "superstate",
                "superstates",
                "supertax"
        };
        Autocomplete autocomplete = new Autocomplete();
        String[] suggestions = autocomplete.getSuggestions(query);
        Assert.assertEquals(expected.length, suggestions.length);
        Assert.assertArrayEquals(expected, suggestions);
    }

    @Test
    public void getSuggestionsForQueryNoMatchesTest() {
        String query = "nomatches";
        String[] expected = {};
        Autocomplete autocomplete = new Autocomplete();
        String[] suggestions = autocomplete.getSuggestions(query);
        Assert.assertEquals(expected.length, suggestions.length);
        Assert.assertArrayEquals(expected, suggestions);
    }
}
