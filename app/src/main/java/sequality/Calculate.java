package sequality;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }
    public int sumArray(int x, int y){
        int sum = 0;
        x = Math.min(x, y);
        y = Math.max(x, y);
        for (int i=x; i<=y; i++){
            sum += i;
        }
        return sum;
    }

    public double ave(double x, double y){
        return (x + y) / 2;
    }
    public double aveArray(int x, int y){
        x = Math.min(x, y);
        y = Math.max(x, y);
        int sum = sumArray(x, y);
        return (double)sum / (y - x + 1);
    }
    public int sumOdd(int x, int y){
        int odd = 0;
        for (int i=x; i<=y; i++){
            if (i % 2 == 1) odd += i;
        }
        return odd;
    }
    public int sumEven(int x, int y){
        int even = 0;
        for (int i=x; i<=y; i++){
            if (i % 2 == 0) even += i;
        }
        return even;
    }
}
