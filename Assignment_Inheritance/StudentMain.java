package Learnmaxxing.Assignment_Inheritance;

public class StudentMain{
    public static void main(String[] args) {
        ZSGSStudent zsgsStudent = new ZSGSStudent("Graduate Studies","Janaarthanan",2024,"ZSGSCH1442");
    }
}
class Students {
    static String schoolname;
    static String Name;
    static int batch;
    public Students(String schoolname, String Name, int batch){ //parent class constructor method.
        this.schoolname = schoolname;
        this.Name = Name;
        this.batch = batch;
    }
}
class ZSGSStudent extends Students {
    static String ZSGSID;
    public ZSGSStudent(String schoolname, String Name, int batch,String ZSGSID) { //child constructor method with 1 extra parameter.
        super(schoolname, Name, batch); //constructor created from child using "super" keyword
        this.ZSGSID = ZSGSID;
    }
}

