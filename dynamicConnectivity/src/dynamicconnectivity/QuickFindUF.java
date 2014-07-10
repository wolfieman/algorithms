/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicconnectivity;

/**
 *
 * @author Wolfgang Sanyer <wolfgang.sanyer@benefitfocus.com>
 */
public class QuickFindUF {
    private int[] id;
    
    public QuickFindUF(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    QuickFindUF() {
        this(10);
    }
        
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i <id.length; i++) {
            if (id[i] == pid)
                id[i] = qid;
        }
    }
}
