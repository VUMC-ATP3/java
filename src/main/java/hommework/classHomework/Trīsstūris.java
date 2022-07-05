package hommework.classHomework;

public class Trīsstūris {
    double mala1;
    double mala2;
    double mala3;
    double laukums;

    Trīsstūris(){
        System.out.println("Mēs šobrīd veidojam trijstūri");
    }

    public Trīsstūris(int mala1, int mala2, int mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
        double pusperimetrs = (mala1 + mala2 + mala3) / 2;
        laukums = Math.sqrt(pusperimetrs * (pusperimetrs - mala1) * (pusperimetrs - mala2) * (pusperimetrs - mala3));
    }
    public void printLaukums(){
        System.out.println("Trijstūra laukums ir " + laukums);
    }

    public boolean irVienādmalu() {
        System.out.println("Vai trijstūris ir vienādmalu?");
        if (mala1 == mala2 && mala1 == mala3)
            return true;
        else
            return false;
    }


    public boolean irVienādsānu() {
        System.out.println("Vai trijstūris ir vienādsānu?");
        if (mala1 == mala2 || mala2 == mala3 || mala3 == mala1)
            return true;
        else
            return false;

    }
}

