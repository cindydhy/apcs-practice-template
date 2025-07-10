public class MemberInfo {
    String name;
    int gradYear;
    boolean hasGoodStanding;
    
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }


     // public void addMembers(String[] name, int gradyear) {
     //     // how do we get the length of an array?
     //     for(int i= 0; i< name.length;, i++){
     //         MemberInfo student = new MemberInfo(name[i], gradYear, true);
     //         // We can't call the class name here because all the methods in the class are not static methods
     //         // We would want to use "student" to call it's methods
     //         memberList.add(student);
     //     }
}
    

