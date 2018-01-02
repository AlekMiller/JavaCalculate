public class Calculator {
    /*
    ���� �����������, � ��� ��������� ������ �������������� ��������
     */
    private int result;
    /*
     ����� ����
     */
    public void add(int... params) {
        for (int i : params) {
            this.result += i;
        }
    }
    /*
     ����� ���������
     */
    public void minus(int... params) {
        int first = params [0];
        for (int i = 1; i < params.length; i++) {
            first-=params[i];
        }
        this.result = first;
    }
    /*
     ������� ����������
     */
    public void cleanResult (){
        this.result=0;
    }
    /*
     �������� ���������
     */
    public int getResult() {
        return this.result;
    }
}
