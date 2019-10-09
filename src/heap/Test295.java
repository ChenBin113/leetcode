package heap;

/**
 * @date 2019/10/9 1:27
 */
public class Test295 {
    public static void main(String[] args) {
        _295_FindMedianfromDataStream obj = new _295_FindMedianfromDataStream();
        obj.addNum(1);
        obj.addNum(2);
        double param_1 = obj.findMedian();
        obj.addNum(3);
        double param_2 = obj.findMedian();
        System.out.println(param_1);
        System.out.println(param_2);
    }
}
