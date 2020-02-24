/**
 * @ClassName: ArrayListTest
 * @Author: liugui
 * @Date: 2020-02-20 12:15
 **/
public class ArrayListTest implements Comparable<Integer> {

    //温习接口的实现
    private final int value = 0;

    @Override
    public int compareTo(Integer o) {
        int thisVal = this.value;
        int anotherVal = o;
        return (thisVal < anotherVal ? -1 : ( thisVal == anotherVal ? 0 : 1));
    }
}
