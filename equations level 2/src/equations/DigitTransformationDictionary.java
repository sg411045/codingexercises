package equations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DigitTransformationDictionary {

    private static final String ONE = "1";

    private static final String EIGHT = "8";

    private static final String SEVEN = "7";

    private static final String FOUR = "4";

    private static final String FIVE = "5";

    private static final String TWO = "2";

    private static final String THREE = "3";

    private static final String ZERO = "0";

    private static final String SIX = "6";

    private static final String NINE = "9";

    public Map<String, ArrayList<String>> digitMap =
        new HashMap<String, ArrayList<String>>();

    public DigitTransformationDictionary() {

        init();
    }

    public void init() {

        ArrayList<String> list0 = new ArrayList<String>();
        list0.add(NINE);
        list0.add(SIX);
        digitMap.put(ZERO, list0);

        ArrayList<String> list1 = new ArrayList<String>();
        digitMap.put(ONE, list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add(THREE);
        digitMap.put(TWO, list2);

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add(TWO);
        list3.add(FIVE);
        digitMap.put(THREE, list3);

        ArrayList<String> list4 = new ArrayList<String>();
        digitMap.put(FOUR, list4);

        ArrayList<String> list5 = new ArrayList<String>();
        list5.add(THREE);
        digitMap.put(FIVE, list5);

        ArrayList<String> list6 = new ArrayList<String>();
        list6.add(ZERO);
        list6.add(NINE);
        digitMap.put(SIX, list6);

        ArrayList<String> list7 = new ArrayList<String>();
        digitMap.put(SEVEN, list7);

        ArrayList<String> list8 = new ArrayList<String>();
        digitMap.put(EIGHT, list8);

        ArrayList<String> list9 = new ArrayList<String>();
        list9.add(ZERO);
        list9.add(SIX);
        digitMap.put(NINE, list9);
    }

    public ArrayList<String> getPossibleTransformationsForDigit(String digit) {

        return digitMap.get(digit);
    }

}
