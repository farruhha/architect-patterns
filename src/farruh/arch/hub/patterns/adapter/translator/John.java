package farruh.arch.hub.patterns.adapter.translator;

import jdk.nashorn.internal.scripts.JO;

import java.util.HashMap;

public class John implements ITarget {

    static HashMap<String, String> englishFrenchMap = new HashMap<>();
    static HashMap<String, String> frenchEnglishMap = new HashMap<>();

    David david = new David();
    John john = new John();

    static {
        englishFrenchMap.put("how are you","comment ulves");
        englishFrenchMap.put("Im in usa","Je sus eh tanus");
        frenchEnglishMap.put("Jeuss beean","Im fine");
        frenchEnglishMap.put("doue ets ves","where are you");
    }
    @Override
    public String translateAndTellToOtherPeople(String sentence, String convertedLanguage) {
        return null;
    }
}
