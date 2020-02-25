/**
 * @ClassName: SelectionSort
 * @Author: liugui
 * @Date: 2020-02-24 21:53
 **/
public class SelectionSort {

    //交换下标i和j数组元素的位置 常数时间算法
    public static void swapElements(int[] arrays,int i,int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

    /**
     * 找到最小值下标   线性时间算法
     * 从起始下标开始到数组的最后位置
     * @param arrays 数组
     * @param start 起始下标
     * @return 最小值下标
     */
    public static int indexLowest(int[] arrays, int start){
        int lowIndex = start;
        for (int i = start; i < arrays.length; i++) {
            if (arrays[i] < arrays[lowIndex]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * 选择排序对元素排序   平方级算法
     * @param arrays
     */
    public static void selecltionSort(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            int j = indexLowest(arrays,i);
            swapElements(arrays,i,j);
        }
    }

}
