public class RefactorGenericMethod {

    public static <T extends Comparable> T getMax(T first, T second, T third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }

    public static void main(String[] args) {
        Integer firstInt = 1, secondInt = 2, thirdInt = 3;
        Float firstFloat = 1.2f, secondFloat = 8.2f, thirdFloat = 60.2f;
        String firstString = "Virat", secondString = "Dhoni", thirdString = "Sachin";
        System.out.println(getMax(firstString, secondString, thirdString));
        System.out.println(getMax(firstInt, secondInt, thirdInt));
        System.out.println(getMax(firstFloat, secondFloat, thirdFloat));
    }
}