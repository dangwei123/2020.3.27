定一副牌，每张牌上都写着一个整数。

此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：

每组都有 X 张牌。
组内所有的牌上都写着相同的整数。
仅当你可选的 X >= 2 时返回 true。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] arr=new int[10000];
        for(int i:deck){
            arr[i]++;
        }
        int i=0;
        for(;i<10000;i++){
            if(arr[i]!=0){
                break;
            }
        }
        int count=arr[i];
        while(count>1){
            int tmp=i;
            while(tmp<10000&&arr[tmp]%count==0){
                tmp++;
            }
            if(tmp==10000){
                return true;
            }
            count--;
        }
        return false;
    }
}

编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
class Solution {
    public void reverseString(char[] s) {
        reverse(0,s.length-1,s);
    }
    private void reverse(int left,int right,char[]s){
        if(left>=right){
            return;
        }
        reverse(left+1,right-1,s);
        char tmp=s[left];
        s[left]=s[right];
        s[right]=tmp;
    }
}

