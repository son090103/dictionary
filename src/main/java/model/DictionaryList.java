/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import validation.Validation;

/**
 *
 * @author son
 */
public class DictionaryList {
     HashMap<String, String> hm = new HashMap<>();
    public Validation validation = new Validation();
    public void addNewWord() {
        System.out.print("Enter English: ");
        String english = validation.checkInputString();
        if (!checkKeywordExist(english)) {
            if (!validation.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = validation.checkInputString();
        hm.put(english, vietnam);
        System.err.println("Add successful.");
    }

    public void deleteWord() {
        System.out.print("Enter english: ");
        String english = validation.checkInputString();
        hm.remove(english);
        System.err.println("Delete successful.");
    }

    public void translate() {
        System.out.print("Enter english: ");
        String english =validation.checkInputString();
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry entry : entries) {
            if (entry.getKey().equals(english)) {
                System.out.println("Vietnamese: " + entry.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
    }

    public boolean checkKeywordExist(String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if (english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}
