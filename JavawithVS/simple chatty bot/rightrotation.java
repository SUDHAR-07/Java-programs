import java.util.*;

class rightrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seq = sc.nextLine().split(" ");
        int shift = sc.nextInt();

        String[] out = new String[seq.length];
        for (int i = 0; i < seq.length; i++) {
            out[(i + shift) % seq.length] = seq[i];
        }
        sc.close();
        System.out.println(String.join(" ", out));
    }
}
/* Not really sure what do  you mean by that. How modulo operator works?
Ok. Just imagine an array of size 5. And some shift, let say it's 11.
The elements of an array is nothing more but just numbers representing indexes (as an example).
The placement without shift would be [0, 1, 2, 3, 4]. However, we need to shift it. The naive way is just to move each element K times. Here K is 11.
[4, 0, 1, 2, 3] after 1 iteration
[3, 4, 0, 1, 2] after 2 iterations
[2, 3, 4, 0, 1]
[1, 2, 3, 4, 0]
[0, 1, 2, 3, 4]
[4, 0, 1, 2, 3] ...
[3, 4, 0, 1, 2]
[2, 3, 4, 0, 1]
[1, 2, 3, 4, 0]
[0, 1, 2, 3, 4]
[4, 0, 1, 2, 3] after 11 iterations

It will take a lot of time if an array is huge and shift is huge.

As you might notice, it has the pattern. No surprises the array is the same if shift is exactly as the size of the array. To be precise a shift number is divisible by size of an array.
So, let's take advantage of this and apply modulo operator. 11 % 5 = 1. It gives as a number of shift WITHOUT repetitions. (The modulo operator gives a reminder of division e.g. 11 / 5 equals 2 and 1 left. 5 * 2 + 1 = 11)

So we can do it in code. (i + shift) % seq.length

i -> index [0, n)
shift -> 11
seq.length -> 5

=> 0 + 11 = 11, 11 % 5 = 1 [ _, 0, _, _, _]
=> 1 + 11 = 12, 12 % 5 = 2 [ _, 0, 1, _, _]
=> 2 + 11 = 13, 13 % 5 = 3 [ _, 0, 1, 2, _]
=> 3 + 11 = 14, 14 % 5 = 4 [ _, 0, 1, 2, 3]
=> 4 + 11 = 15, 15 % 5 = 0 [ 4, 0, 1, 2, 3]

The final array is [4, 0, 1, 2, 3].*/