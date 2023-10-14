/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import model.DictionaryList;

/**
 *
 * @author son
 */
public class DictionaryManager extends Menu<String>{
private DictionaryList list= new DictionaryList();
    public DictionaryManager(String title, String[] s){
        super(title, s);
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.addNewWord();
                break;
            case 2:
                list.deleteWord();
                break;
            case 3: 
                list.translate();
                break;
            case 4:
                System.exit(0);        
        }
    }
    
}
