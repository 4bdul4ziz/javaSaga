/*
1. Perform the following operations:
    A. Create an empty list using collection frame work named list_days to hold the days of the week.
    B. Add all the weekdays to the created list except Wednesday.
    C. Print the resultant list
    D. Iterate the list using any three different ways(either using for or foreach or Iterator Interface)
    E. Add Sunday to the beginning of the list and Saturday to the ending of the list and Wednesday after Tuesday in the List.
    F. Set Sunday and Saturdays as Holiday.
    G. Check whether Holiday is present in list or not.
    H. Remove Holidays from the list.
    I. Copy all the elements form list_days into new list named week_days. J. Sort the new list and display it.
    K. Shuffle and display the elements of list_days.
    L. Compare days_list with week_days.
    M. Sort and Reverse both the lists.
    N. Compare days_list with week_day.
    O. Swap 1st and last elements in both the lists.
    P. Remove all the elements from the list_days.
    Q. Check the list_days is empty or not.
    R. Shuffle and display the elements of list_days.
    S. Compare days_list with week_days.
 */

import java.util.*;

public class collection20BRS1185 {
    public static void main(String[] args) {
        // A. Create an empty list using collection frame work named list_days to hold the days of the week.
        List<String> list_days = new ArrayList<String>();
        // B. Add all the weekdays to the created list except Wednesday.
        list_days.add("Monday");
        list_days.add("Tuesday");
        list_days.add("Thursday");
        list_days.add("Friday");
        list_days.add("Saturday");
        list_days.add("Sunday");
        // C. Print the resultant list
        System.out.println(list_days);
        // D. Iterate the list using any three different ways(either using for or foreach or Iterator Interface)
        // 1. Using for loop
        for (int i = 0; i < list_days.size(); i++) {
            System.out.println(list_days.get(i));
        }
        // 2. Using for each loop
        for (String i : list_days) {
            System.out.println(i);
        }
        // 3. Using Iterator Interface
        Iterator<String> it = list_days.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // E. Add Sunday to the beginning of the list and Saturday to the ending of the list and Wednesday after Tuesday in the List.
        list_days.add(0, "Sunday");
        list_days.add(6, "Wednesday");
        list_days.add(7, "Saturday");
        // F. Set Sunday and Saturdays as Holiday.
        list_days.set(0, "Holiday");
        list_days.set(7, "Holiday");
        // G. Check whether Holiday is present in list or not.
        if (list_days.contains("Holiday")) {
            System.out.println("Holiday is present in list");
        } else {
            System.out.println("Holiday is not present in list");
        }
        // H. Remove Holidays from the list.
        list_days.remove("Holiday");
        // I. Copy all the elements form list_days into new list named week_days.
        List<String> week_days = new ArrayList<String>();
        week_days.addAll(list_days);
        // J. Sort the new list and display it.
        Collections.sort(week_days);
        System.out.println(week_days);
        // K. Shuffle and display the elements of list_days.
        Collections.shuffle(list_days);
        System.out.println(list_days);
        // L. Compare days_list with week_days.
        if (list_days.equals(week_days)) {
            System.out.println("Both the lists are equal");
        } else {
            System.out.println("Both the lists are not equal");
        }
        // M. Sort and Reverse both the lists.
        Collections.sort(list_days);
        Collections.reverse(list_days);
        Collections.sort(week_days);
        Collections.reverse(week_days);
        // N. Compare days_list with week_day.
        if (list_days.equals(week_days)) {
            System.out.println("Both the lists are equal");
        } else {
            System.out.println("Both the lists are not equal");
        }
        // O. Swap 1st and last elements in both the lists.
        Collections.swap(list_days, 0, list_days.size() - 1);
        Collections.swap(week_days, 0, week_days.size() - 1);
        // P. Remove all the elements from the list_days.
        list_days.clear();
        // Q. Check the list_days is empty or not.
        if (list_days.isEmpty()) {
            System.out.println("list_days is empty");
        } else {
            System.out.println("list_days is not empty");
        }
        // R. Shuffle and display the elements of list_days.
        Collections.shuffle(list_days);
        System.out.println(list_days);
        // S. Compare days_list with week_days.
        if (list_days.equals(week_days)) {
            System.out.println("Both the lists are equal");
        } else {
            System.out.println("Both the lists are not equal");
        }
    }
}






