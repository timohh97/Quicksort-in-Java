import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=7;i>=0;i--)
        {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(quickSort(list));
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list)
    {
        if(list.size()==1||list.size()==0)
        {
            return list;
        }

        int pivot = list.get(0);
        ArrayList<Integer> leftPart = new ArrayList<>();
        ArrayList<Integer> rightPart = new ArrayList<>();

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<pivot)
            {
                leftPart.add(list.get(i));
            }
            else
            {
                rightPart.add(list.get(i));
            }
        }

        ArrayList<Integer> leftPartSorted =quickSort(leftPart);
        ArrayList<Integer> rightPartSorted =quickSort(rightPart);
        ArrayList<Integer> single = new ArrayList<>();
        single.add(pivot);

        leftPartSorted.addAll(single);
        leftPartSorted.addAll(rightPartSorted);
        return leftPartSorted;

    }
}
