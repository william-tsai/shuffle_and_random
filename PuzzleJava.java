import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> greaterThan10(int[] anArray) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < anArray.length; i++) {
            sum += anArray[i];
            if (anArray[i] > 10) {
                result.add(anArray[i]);
            }
        }
        System.out.println(sum);
        return result;
    }
    public ArrayList<String> longerThan5Char(ArrayList<String> namesArray) {
        Collections.shuffle(namesArray);
        ArrayList<String> result = new ArrayList<String>();
        for (String name: namesArray) {
            System.out.println(name);
            if (name.length() > 5) {
                result.add(name);
            }
        }
        return result;
    }
    public void displayChar(ArrayList<String> anArray) {
        Collections.shuffle(anArray);
        System.out.println(anArray.get(25));
        System.out.println(anArray.get(0));
        ArrayList<String> vowels = new ArrayList<String>(
            Arrays.asList("a", "e", "i", "o", "u")
        );        
        for (String vowel: vowels) {
            if (vowel == anArray.get(0)) {
                System.out.println("First alphabet is a vowel!");
            }
        }
    }
    public int[] randomTenNum() {
        Random r = new Random();
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = 55 + r.nextInt(46);
        }
        return result;
    }
    public ArrayList<Integer> randomSortedTenNum() {
        Random r = new Random();
        Integer min = 73;
        Integer max = 73;
        int randNum;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randNum = 55 + r.nextInt(46);
            result.add(randNum);
            if (randNum > max) {
                max = randNum;
            }
            if (randNum < min) {
                min = randNum;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        Collections.sort(result);
        return result;
    }
    public String randString() {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random r = new Random();
        char[] tempArray = new char[5];
        for (int i = 0; i < 5; i++) {
            tempArray[i] = alphabets[r.nextInt(26)];
        }
        String result = new String(tempArray);
        return result;
    }
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();
        //
        int[] array1 = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(puzzleJava.greaterThan10(array1));
        //
        ArrayList<String> array2 = new ArrayList<String>(
            Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa")
        );
        System.out.println(puzzleJava.longerThan5Char(array2));
        //
        ArrayList<String> alphabets = new ArrayList<String>(
            Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
        );
        puzzleJava.displayChar(alphabets);
        //
        System.out.println(Arrays.toString(puzzleJava.randomTenNum()));
        //
        System.out.println(puzzleJava.randomSortedTenNum());
        //
        System.out.println(puzzleJava.randString());
    }
}