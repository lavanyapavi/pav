public static void sort(String[] a) {

    int n = a.length;
    for (int i = 1; i < n; i++) {
        for (int j = i; j > 0; j--) {
            if (a[j-1].compareTo(a[j]) > 0)
                exch(a, j, j-1);
            else break;
        }
    }
}
{
}
