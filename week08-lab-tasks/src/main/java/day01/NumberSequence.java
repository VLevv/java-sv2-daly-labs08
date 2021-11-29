package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> integers=new ArrayList<>();

    public NumberSequence(List<Integer> integers){
        this.integers=integers;
    }

    public NumberSequence(int amount,int min,int max){
        Random random = new Random();
        for (int i = 0;i<amount;i++){
            integers.add(random.nextInt(min,max));
        }
    }

    public List<Integer> closeToAverage(int value){
        int sum = 0;
        List<Integer> results=new ArrayList<>();
        for (int i:
             integers) {
            sum+=i;
        }
        int average =sum/integers.size();
        for (int i:
             integers) {
            if(i>average-value&&i<average+value){
                results.add(i);
            }
        }
        return results;
    }
}
