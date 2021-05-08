package com.exercise.exams.coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindIntersection {
//    Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain
//    2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order,
//    the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return
//    a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there
//    is no intersection, return the string false.
//    Examples:
//    Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}, Output: 1,4,13
//    Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}, Output: 1,9,10
    public static String findIntersection(String[] strArr) {
        String[] firstArr = strArr[0].split(", ");
        String[] secondArr = strArr[1].split(", ");
        List<String> resultList = new ArrayList<>();
        Arrays.stream(firstArr).forEach(firstEl -> {
                Optional<String> intersection = Arrays.stream(secondArr)
                        .filter(secondEl -> secondEl.equals(firstEl))
                        .findAny();
                intersection.ifPresent(resultList::add);
        });
        String result = resultList.toString();
        return resultList.size() == 0 ? "false" : result.substring(1, result.length()-1).replaceAll("\\s","");
    }
}
