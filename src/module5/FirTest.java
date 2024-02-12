

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 6
        System.out.println(firTest.test(firNum, 3));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // числа, кратные и 3, и 5, исключаются
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}