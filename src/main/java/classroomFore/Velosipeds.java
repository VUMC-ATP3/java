package classroomFore;

public class Velosipeds {
    int riepuSkaits;
    String krasa;
    int atrums=0;
    //bremžu veids V vai D veida
    char bremzuTips;

public void spiestPedalus(){
    //katru reizi, kad spiež pedāļus, palielina ātrumu
    System.out.println("Cilvēks palielina ātrumu");
    atrums=atrums+1; //atrums++;
}

public void bremzet (){
    //katru reizi, kad spiež bremzes, samazina ātrumu
    System.out.println("Cilvēks bremzē");
    if(bremzuTips== 'D'){
        atrums= atrums-2;
    } else if (bremzuTips=='V'){
    atrums= atrums-1;}
    else {
        System.out.println("Man nav bremžu");
    }
}
public void printetAtrumu(){
    System.out.println(atrums+ "km/h");
}

}
