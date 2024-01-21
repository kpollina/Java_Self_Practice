package day05_practice_tasks;

public class Alphabets {
    public static void main(String[] args) {

        char j = 'E';
        for (char i = 'A'; i <= j; i++) {
            System.out.println();
            for (char k = 'a'; k <= 'z'; k++) {
                System.out.print(i + "" + (k) + " ");
            }
        }




    }



}



/*
Create a class named Alphabets and use a nested loop to print the following output:

		Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
		Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
		Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
		Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
		Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez

 */