package linearSum;

public class LinearSum {

    public int linearSum(int[] a, int i) {

        if (i == 1) {
            return a[0];
        }

        else {
            return linearSum(a , i - 1) + a[i - 1];
        }

    }

}
