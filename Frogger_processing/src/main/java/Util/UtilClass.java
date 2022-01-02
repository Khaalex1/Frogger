package Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class UtilClass {

    public static String record_treatment(Path path, float t){
        String remark = null;
        File file = new File(path.toString());
        ArrayList<String> Snumbers = new ArrayList<String>();
        ArrayList<String> NSnumbers = new ArrayList<String>();
        try{
            float[] numbers = new float[10];
            for (String ligne : Files.readAllLines(path)) {
                Snumbers.add(ligne.substring(3, ligne.length()-1));
                //System.out.println(ligne.substring(3, ligne.length()-1));
            }
            for (int i =0; i<Snumbers.size(); i++){
                numbers[i]= Float.parseFloat(Snumbers.get(i));
                //System.out.println(numbers[i]);
            }
            numbers[9] =t;
            java.util.Arrays.sort(numbers);
            if (numbers[0]==t){
                remark = "You ranked first ! (°0°)";
            }
            else if (numbers[9]!=t){
                remark = "You are in the leaderboard ! (=^_^=)";
            }
            else {
                remark = "But you didn't rank in the leaderboard (>_<)";
            }
            System.out.println("LEADERBOARD : ");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            for (int i=0; i<9; i++){
                int k = i+1;
                NSnumbers.add(k +". " + numbers[i] + "s\n" );
                System.out.print(NSnumbers.get(i));
                fw.write(NSnumbers.get(i));
            }
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return remark;
    }

    public static String endless_treatment(Path path, float t){
        String remark = null;
        File file = new File(path.toString());
        ArrayList<String> Snumbers = new ArrayList<String>();
        ArrayList<String> NSnumbers = new ArrayList<String>();
        try{
            float[] numbers = new float[10];
            for (String ligne : Files.readAllLines(path)) {
                Snumbers.add(ligne.substring(3, ligne.length()));
                //System.out.println(ligne.substring(3, ligne.length()-1));
            }
            for (int i =0; i<Snumbers.size(); i++){
                numbers[i]= Float.parseFloat(Snumbers.get(i));
                //System.out.println(numbers[i]);
            }
            numbers[9] =t;
            java.util.Arrays.sort(numbers);
            if (numbers[9]==t){
                remark = "You ranked first ! (°0°)";
            }
            else if (numbers[0]!=t){
                remark = "You are in the leaderboard ! (=^_^=)";
            }
            else {
                remark = "You didn't rank in the leaderboard (>_<)";
            }
            System.out.println("LEADERBOARD : ");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            for (int i=0; i<9; i++){
                int k = i+1;
                NSnumbers.add(k +". " + numbers[numbers.length-i-1] + "\n" );
                System.out.print(NSnumbers.get(i));
                fw.write(NSnumbers.get(i));
            }
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return remark;
    }


    public static int random_btw(int begin, int end){
            Random rand = new Random();
            return rand.nextInt(end - begin + 1) + begin;
    }
}
