package ArrayListTest;

/**
 * @ClassName: MyArrayList
 * @Author: liugui
 * @Date: 2020-03-02 21:53
 **/
public class MyArrayList<E> {

    private int size;

    private E array[];

    public E get(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }



}
