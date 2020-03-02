package ArrayListTest;

/**
 * @ClassName: ListNote
 * @Author: liugui
 * @Date: 2020-03-02 21:33
 **/
public class ListNote {

    public Object   data;
    public ListNote next;

    public ListNote() {
        this.data = null;
        this.next = null;
    }

    public ListNote(Object data) {
        this.data = data;
        this.next = null;
    }

    public ListNote(Object data, ListNote next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNote{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {

        ListNote note1 = new ListNote(1);
        ListNote note2 = new ListNote(2);
        ListNote note3 = new ListNote(3);

        ListNote note = new ListNote(0,note1);


        System.out.println(note.next);

    }
}
