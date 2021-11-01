class fibonacci {
  
    static int fbsq(int n)
    {
  
        int f[] = new int[n+2];
  
        int i;
  
        f[0]=0;
        f[1]=1;
  
        for (i=2; i <= n; i++) {
  
           f[i] = f[i-1] + f[i-2];
        }
  
       return f[n];
    }
  
    public static void
    main(String args[])
    {
        
        int N=21;
  
        for (int i=0; i<N; i++)
            System.out.print(fbsq(i) + " ");
    }
}

//ΑΠΛΟ ΠΑΡΑΔΕΙΓΜΑ ΑΛΛΗΛΟΥΧΙΑΣ FIBONACCI

//ΓΙΑ ΑΥΞΟΜΕΙΩΣΗ ΤΗΣ ΤΙΜΗΣ ΚΑΙ ΚΑΤ'ΕΠΕΚΤΑΣΗ ΤΗΣ ΑΛΛΗΛΟΥΧΙΑΣ ΑΡΙΘΜΟΝ FIBONACCI ΔΙΑΤΡΕΞΤΕ ΣΤΗΝ ΓΡΑΜΜΗ 25 ΚΑΙ ΑΛΛΑΞΤΕ ΤΟΝ ΑΚΕΡΑΙΟ ΑΡΙΘΜΟ N=...

//ΜΑΘΗΜΑΤΙΚΗ ΦΟΡΜΟΥΛΑ F{n}=F{n-1}+F{n-2}
//                    ΟΠΟΥ F{0} = 0 ΚΑΙ F{1} = 1


//f1=1,f2=1,f3=2,f4=3,f5=5,f6=8,f7=13,f8=21,f9=34,f10=55,f11=89,f12=144,…

//F0 	F1 	F2 	  F3 	    F4 	    F5 	    F6 	    F7 	    F8 	    F9 	    F10     F11     F12     F13     F14     F15     F16     F17     F18     F19     F20
//00   1   1 	    2 	    3 	    5 	    8 	    13 	    21 	    34 	    55 	    89 	    144     233     377     610     987     1597    2584    4181    6765

//1+1=2
//1+2=3
//2+3=5
//3+5=8
//5+8=13
//8+13=21
//13+21=34
//21+34=55
//34+55=89
//55+89=144
//89+144=233
//144+233=377
//233+377=610
//377+610=987
//610+987=1597
//987+1597=2584
//2584+4181=6765
