package com.forest.guessthegame;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by forest on 05.04.2017.
 */

public class Game_HashMap {
    private static Map<String, String> mapOfAllGame = new HashMap<>();
    private String question_NameOfGame = null;
    private String answer = null;
    private List<String> arrayOfKeyHashMap = copyKeyMapToStringListArray();
    private int indexOfArrayOfKey = 0;

    static {
        mapOfAllGame.put("Earthworm Jim", "earthworm_jim");
        mapOfAllGame.put("Duck Hunt", "duckhunt");
        mapOfAllGame.put("Battletoads", "battletoads");
        mapOfAllGame.put("Pro Evolution Soccer 2017", "pro_evolution_soccer_2017");
        mapOfAllGame.put("Assassins Creed Unity", "assassins_creed_unity");
        mapOfAllGame.put("Counter-Strike GO", "counter_strike_go");
        mapOfAllGame.put("Crysis", "crysis");
        mapOfAllGame.put("Dark Soul", "dark_soul");
        mapOfAllGame.put("Fallout 4", "fallout_4");
        mapOfAllGame.put("GTA San Andreas", "gta_san_andreas");
        mapOfAllGame.put("Battlefield 3", "battlefield_3");
        mapOfAllGame.put("The Sims 4", "the_sims_4");
        mapOfAllGame.put("GTA Vice City", "gta_vice_city");
        mapOfAllGame.put("Overwatch", "overwatch");
        mapOfAllGame.put("The Elder Scrolls V: Skyrim", "the_elder_scrolls_v_skyrim");
        mapOfAllGame.put("Sonic The Hedgehog", "sonic_the_hedgehog");
        mapOfAllGame.put("Super Mario", "super_mario");
        mapOfAllGame.put("Crysis", "crysis");
        mapOfAllGame.put("Need for Speed Underground 2", "nfs_underground_2");
        mapOfAllGame.put("Dead Space 3", "dead_space_3");
        mapOfAllGame.put("The Last of Us", "the_last_of_us");
        mapOfAllGame.put("Mass Effect 3", "mass_effect_3");
    }

    public void firstStartRightQuestion(){
//        arrayOfKeyHashMap = new ArrayList<>(mapOfAllGame.keySet());
        System.out.println(arrayOfKeyHashMap.size()+" size !!!");
        indexOfArrayOfKey = randomNameOfGame();
        question_NameOfGame = arrayOfKeyHashMap.get(indexOfArrayOfKey);
        //randomSetTextToTextView();
        answer = question_NameOfGame;
        Log.e("Answer", "anser = "+answer);


    }

    public ArrayList<String> copyKeyMapToStringListArray(){
        return new ArrayList<>(mapOfAllGame.keySet());
    }

    public int randomNameOfGame(){
        return (int) (Math.random()*(arrayOfKeyHashMap.size()-1));
    }

    public static Map<String, String> getMapOfAllGame() {
        return mapOfAllGame;
    }

    public String getQuestion_NameOfGame() {
        return question_NameOfGame;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getArrayOfKeyHashMap() {
        return arrayOfKeyHashMap;
    }

    public void setArrayOfKeyHashMap(List<String> arrayOfKeyHashMap) {
        this.arrayOfKeyHashMap = arrayOfKeyHashMap;
    }

    public int getIndexOfArrayOfKey() {
        return indexOfArrayOfKey;
    }
}
