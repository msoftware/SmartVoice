package com.diamond.SmartVoice.Recognizer;

import java.util.Locale;

/**
 * @author Dmitriy Ponomarev
 */
public class Grammar {
    private final Dict mDict;
    private final PhonMapper mPhonMapper;

    Grammar(PhonMapper phonMapper) {
        mDict = new Dict();
        mPhonMapper = phonMapper;
    }

    public String getDict() {
        return mDict.toString();
    }

    public void addWords(String text) {
        String[] words = text.toLowerCase(Locale.getDefault()).trim().split(" ");
        for (String word : words) {
            mDict.add(word, mPhonMapper.getPronoun(word));
        }
    }
}