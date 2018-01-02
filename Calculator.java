public class Calculator {
    private int result;

    public void add(int... params) {
        for (int i : params) {
            this.result +=i;
        }
    }
    public void cleanResult (){
        this.result=0;
    }
    public int getResult() {
        return this.result;
    }
}
