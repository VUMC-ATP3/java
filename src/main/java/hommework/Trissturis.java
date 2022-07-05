package hommework;

public class Trissturis {

    int mala1;
    int mala2;
    int mala3;
    double laukums;

    public Trissturis(int mala1, int mala2, int mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
    }

    Trissturis(){
        System.out.println("Mēs šobrīd veidojam trijstūri");
    }
    public void printMalas(){
        System.out.println("Trijstūra malu garumi ir: " + mala1+ " , "+ mala2+ ", "+mala3);
    }


    public void trissturLaukums(int mala1, int mala2, int mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
        this.laukums = laukums;
        double pusperimetrs= (mala1+mala2+mala3)/2;
        laukums= Math.sqrt(pusperimetrs*(pusperimetrs-mala1)*(pusperimetrs-mala2)*(pusperimetrs-mala3));
        System.out.println("Trijstūra laukums ir "+ pusperimetrs+laukums);
    }

    public boolean irVienādsānu(){
     System.out.println("Vai trijstūris ir vienādsānu?");
    if (mala1==mala2||mala2==mala3|| mala3==mala1)
        return true;
    else
        return false;

 }

 public boolean irVienādmalu(){
     System.out.println("Vai trijstūris ir vienādmalu?");
    if (mala1==mala2&& mala1==mala3)
        return true;
    else
        return false;
 }
}
