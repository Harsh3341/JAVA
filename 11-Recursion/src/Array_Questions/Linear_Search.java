package Array_Questions;

import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 6, 7 };
        // System.out.println(search(arr, 4, 0));
        // System.out.println(searchLast(arr, 4, arr.length - 1));

        // ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        // System.out.println(ans);

        System.out.println(findAllIndex2(arr, 4, 0));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        else {
            return search(arr, target, index + 1);
        }
    }

    static int searchLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        else {
            return searchLast(arr, target, index + -1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
