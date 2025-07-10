import java.util.*;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public void addMembers(String[] name, int gradYear) {
         // how do we get the length of an array? done
        // TODO: can we remove the comma here
         for(int i= 0; i< name.length; i++){
             MemberInfo student = new MemberInfo(name[i], gradYear, true);
             // TODO: memberList is an ArrayList of type MemberInfo
             // everything in this list has to be a MemberInfo object
             memberList.add(student);
        }
     }
    
    // // This method returns an ArrayList<MemberInfo>
     public ArrayList<MemberInfo> removeMembers(int years) {
         ArrayList<MemberInfo> goodStanding = new ArrayList<>();
         for(int i = 0; i<memberList.size(); i++){
             // TODO: Soham, can you pls fix the gradYear here:
             if(gradYear >= years && memberList.get(i).inGoodStanding()){
                 goodStanding.add(memberList.get(i));
                 memberList.remove(i);

             }
             // TODO: Soham, can you pls fix the gradYear here:
             else if(gradYear >= years){
                 memberList.remove(i);
             }
         }
         // TODO: memberList is an ArrayList, not a method
         return goodStanding;
     }
}
