package codility.lessons.prefix_sums;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int [] C = new int[P.length];
        for (int i=0; i<P.length; i++) {
            C[i] = factor(S,P[i],Q[i]);
        }

        return C;
    }

    public int factor(String S, int i, int j) {

        String temp = S.substring(i,j+1);

        if (S.substring(i,j+1).contains("A")){
            return 1;
        }else if (S.substring(i,j+1).contains("C")){
            return 2;
        }else if (S.substring(i,j+1).contains("G")){
            return 3;
        }

        return 4;
    }

    public static void main(String[] args) {

        GenomicRangeQuery g = new GenomicRangeQuery();

        int[] P = {2, 5, 0};

        int[] Q = {4, 5, 6};

        System.out.println(g.solution("CAGCCTA",P,Q));

    }
}
