package sort;

public class _004_MediumOfTwoSortedArrays {
    /**
     * num1 3 5 | 8 9           size  4
     * num2 1 2 7 | 10 11 12          6
     *
     * @param A
     * @param B
     */
    public double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) {
            return findMedianSortedArrays(B, A);
        }

        int len = A.length + B.length;
        //数组A插入的切片左边有多少个数
        int cut1 = 0;
        int cut2 = 0;

        int cutL = 0;
        int cutR = A.length;

        if (len < 2) {
            if (len == 0) {
                return 0.0;
            } else {
                return B[0];
            }
        } else if (A.length == 1 && B.length==1) {
            return (A[0] + B[0]) / 2;
        }

        while (cut1 <= A.length) {
            cut1 = (cutR - cutL) / 2 + cutL;
            cut2 = len / 2 - cut1;
            //索引减一
            //min，max是一个数组不用切的情况
            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : A[cut1 - 1];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : B[cut2 - 1];
            double R1 = (cut1 == 0) ? Integer.MAX_VALUE : A[cut1];
            double R2 = (cut2 == 0) ? Integer.MAX_VALUE : B[cut2];
            if (L1 > R2) {
                cutR = cut1 - 1;
            } else if (L2 > R1) {
                cutL = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    L1 = L1 > L2 ? L1 : L2;
                    R1 = R1 < R2 ? R1 : R2;
                    return (L1 + R1) / 2;
                } else {
                    //奇数一般划分L1，L2部分个数少于R1，R2；因为int时相当于舍弃小数部分
                    //所以直接在R1，R2部分取，不理解可以试试
                    R1 = (R1 < R2) ? R1 : R2;
                    return R1;
                }
            }
        }
        return -1;
    }
}
