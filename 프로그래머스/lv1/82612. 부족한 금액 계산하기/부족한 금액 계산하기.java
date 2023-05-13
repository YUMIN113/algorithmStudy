class Solution {
    public long solution(int price, int money, int count) {
        long myAsset = money;
        
        for(int i = 1; i <= count; i++) {
            myAsset -= price * i;
        }
        
        if(myAsset >= 0) {
            return 0;
        }
        return Math.abs(myAsset);
    }
}

// 다른 사람 풀이

// class Solution {
//     public long solution(int price, int money, int count) {
//         long fee = (long) price;
//         return Math.max(((((count + 1) * fee) * count) / 2) - money, 0);
//     }
// }
