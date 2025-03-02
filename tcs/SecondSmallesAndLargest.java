public class SecondSmallesAndLargest {

  public static void main(String[] args) {
    int arr[] = { 1, 2,1, 4, 7,7, 5 };
    int sm = findSecondSmallest(arr);
    int lg = findSecondLargest(arr);
    System.out.println("Second Smallest Eelement: " + sm);
    System.out.println("Second Largest Eelement: " + lg);
  }

  private static int findSecondSmallest(int[] arr) {
    int sm = Integer.MAX_VALUE;
    int ssm = Integer.MAX_VALUE;
    for (int i : arr) {
      if (i < sm) {
        ssm = sm;
        sm = i;
      } else if (i < ssm && sm != ssm && i!=sm) {
        ssm = i;
      }
    }
    return ssm;
  }

  private static int findSecondLargest(int[] arr) {
    int l = Integer.MIN_VALUE;
    int sl = Integer.MIN_VALUE;
    for (int i : arr) {
      if (i > l) {
        sl = l;
        l = i;
      } else if (i > sl && l != sl  && i!=l) {
        sl = i;
      }
    }
    return sl;
  }
}
