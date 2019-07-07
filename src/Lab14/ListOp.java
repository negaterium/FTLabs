package Lab14;

import java.util.*;

public class ListOp {
    public ListOp() {
    }

    public void displayIntegerList(List<Integer> myList) {
        int counter = 0;
        int endOfList = myList.size();
        while (counter < endOfList) {
            System.out.println("List position " + counter + " has value " + myList.get(counter));
            counter++;
        }
    }

    public void displayStringList(List<String> myList) {
        int counter = 0;
        int endOfList = myList.size();
        while (counter < endOfList) {
            System.out.println("List position " + counter + " has value " + myList.get(counter));
            counter++;
        }
    }


    public List<Integer> addValuesToIntegerList(int[] myIntegerList, List<Integer> myList) {

        for (int counter = 0; counter < myIntegerList.length; counter++)
            myList.add(myIntegerList[counter]);
        return (myList);

    }

    public List<String> addValuesToStringList(String[] myStringList, List<String> myList) {

        for (int counter = 0; counter < myStringList.length; counter++)
            myList.add(myStringList[counter]);
        return (myList);

    }

    public List<Integer> addNumberToEndOfList(List<Integer> myList, int endNumber) {
        myList.add(endNumber);
        return (myList);

    }

    public void displayIntegerListFromAValue(List<Integer> myList, int value) {
        int counter = myList.indexOf(value);
        int endOfList = myList.toArray().length;
        while (counter < endOfList) {
            System.out.println("List position " + counter + " has value " + myList.get(counter));
            counter++;
        }
    }

    public void displayIntegerListRevers(List<Integer> myList) {
        int counter = myList.size() - 1;
        while (counter >= 0) {
            System.out.println("List position " + counter + " has value " + myList.get(counter));
            counter--;
        }
    }

    public List<String> setStringInAList(List<String> myList, String myString, int position) {
        myList.add(position, myString);
        return myList;
    }

    public List<Integer> addNumberToBeginingOfList(List<Integer> myList, int value) {
        myList.add(0, value);
        return (myList);

    }

    public int biggestValueOfList(List<Integer> myList) {
        int val = 0;
        for (int counter=0; counter<myList.size();counter++)
            if (myList.get(counter)>val) val = myList.get(counter);
        return val;

    }

}
