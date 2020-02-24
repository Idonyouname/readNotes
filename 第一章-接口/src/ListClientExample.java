import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ListClientExample
 * @Author: liugui
 * @Date: 2020-02-24 21:39
 **/
public class ListClientExample {

    private List list;

    //实例化一个新的ArrayList
    public ListClientExample() {
        list = new ArrayList();
    }

    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample example = new ListClientExample();
        List list = example.getList();
        list.add(1);
        list.add(2);
        System.out.println("list：" + list);
    }
}
