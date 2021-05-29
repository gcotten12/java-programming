package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {

    public static void main(String[] args) {

        Group group1 = new Group("Cyberbugs");
        System.out.println(group1.getMembers().size());
        group1.newMember("Garrett");
        group1.newMember("Kibi");
        group1.newMember("Serhi");
        System.out.println(group1);
        System.out.println("Group 1 members = " + group1.getMembers());

        Group group2 = new Group("Cybercats");
        group2.setMembers(Arrays.asList("Garrett", "Evan", "Zach", "Miguel", "Pedro"));
        if(group2.getMembers().contains("Garrett")) {
            System.out.println("Garrett is a member of group2");
        }else {
            System.out.println("Garrett is NOT a member of group2");

        }

    }

}
