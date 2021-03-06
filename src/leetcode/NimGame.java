package leetcode;

/**You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

 Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

 For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

 Hint:

 If there are 5 stones in the heap, could you figure out a way to remove the stones such that you will always be the winner?
 * Created by Administrator on 2016/7/3.
 */
public class NimGame {
    public boolean canWinNim(int n) {
        return (n & 3) != 0;
    }

    public static void main(String arg[]) {
        System.out.println(new NimGame().canWinNim(4));
        System.out.println(new NimGame().canWinNim(5));
        System.out.println(new NimGame().canWinNim(7));
    }
}
