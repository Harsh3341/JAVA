public class Mountain {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of the array
                start = mid + 1;
            }
        }

        // in teh end , start == end and pointing to the larget number because of the 2
        // checks above
        // start and end are always try to find max element in the above 2 checks
        // hence when they are pointing to just one element, that is the maximum one
        // more elaboration :at every point of the time for start and end , they have
        // the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cus of above line
        // that is the best possible ans

        return start;
    }

}
