class Kata {
    static int lastFibDigit(int n) {
        int F1 = 1, F2 = 1, temp = 0;
        int[] lastDigit = new int[60];
        lastDigit[0] = 1;
        lastDigit[1] = 1;
        for(int i=2; i < 60; i++) {
            lastDigit[i] = (lastDigit[i-1] + lastDigit[i-2]) % 10;
        }
        return lastDigit[(n-1) % 60];
    }
}