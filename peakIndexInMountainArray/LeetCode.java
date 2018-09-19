/*
 * ���ǰѷ����������Ե����� A ����ɽ����
A.length >= 3
���� 0 < i < A.length - 1 ʹ��A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
����һ��ȷ��Ϊɽ�������飬�����κ����� A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] �� i ��ֵ��
ʾ�� 1��
���룺[0,1,0]
�����1
ʾ�� 2��
���룺[0,2,1,0]
�����1

��ʾ��
3 <= A.length <= 10000
0 <= A[i] <= 10^6
A �����϶����ɽ��
*/

package leetcode;


class Solution {
    public int peakIndexInMountainArray(int[] A) { 
    	for(int i=0; i<A.length-1;i++) {
        	if (A[i] > A[i+1]) {
        		return i;
        	}
        }
    	return 0;
    }
}


public class LeetCode {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = {0,2,1,0};
		int mount = s.peakIndexInMountainArray(A);
		System.out.print(mount);
				
	}
	
}
