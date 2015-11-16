package utils;

import java.util.ArrayList;

/**
 * Created by Neelanjana on 7/19/15
 */
public class Constants {

    public static boolean debug = true;


    public static ArrayList<String> getGenericDialogList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Edit");
        list.add("Delete");
        list.add("Close");
        return list;
    }
}
