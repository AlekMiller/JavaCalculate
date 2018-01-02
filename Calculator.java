public class Calculator {
    /*
    Клас калькулятор, в нем находятся методы арифметических операций
     */
    private int result;
    /*
     метод сумы
     */
    public void add(int... params) {
        for (int i : params) {
            this.result += i;
        }
    }
    /*
     метод отнимания
     */
    public void minus(int... params) {
        int first = params [0];
        for (int i = 1; i < params.length; i++) {
            first-=params[i];
        }
        this.result = first;
    }
    /*
     очистка результата
     */
    public void cleanResult (){
        this.result=0;
    }
    /*
     получить результат
     */
    public int getResult() {
        return this.result;
    }
}
