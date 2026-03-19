import java.util.ArrayList;

public class UserNameTester {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        UserName person = new UserName("john", "smith");
        ArrayList<String> names = person.getPossibleNames();
        if (names.size() == 4 && names.contains("smithj") && names.contains("smithjo")
                && names.contains("smithjoh") && names.contains("smithjohn")) {
            System.out.println("PART A: TEST 1 PASSED");
        } else {
            System.out.println("PART A: !!!!!!!TEST 1 FAILED!!!!!!!");
        }
        UserName person2 = new UserName("joseph", "technicolor");
        ArrayList<String> names2 = person2.getPossibleNames();
        if (names2.size() == 6 && names2.contains("technicolorj") && names2.contains("technicolorjo")
                && names2.contains("technicolorjos") && names2.contains("technicolorjose")
                && names2.contains("technicolorjosep") && names2.contains("technicolorjoseph")) {
            System.out.println("PART A: TEST 2 PASSED");
        } else {
            System.out.println("PART A: !!!!!!!TEST 2 FAILED!!!!!!!");
        }
        System.out.println("--------------------------------");
        String[] usedA = {"roberts", "robertsada", "robertsadam", "robertsa"};
        UserName personA = new UserName("test", "guy");
        boolean contains = personA.isUsed("roberts", usedA);
        if (contains) {
            System.out.println("PART B: TEST 1 PASSED");
        } else {
            System.out.println("PART B: !!!!!!!TEST 1 FAILED!!!!!!!");
        }
        contains = personA.isUsed("robertsa", usedA);
        if (contains) {
            System.out.println("PART B: TEST 2 PASSED");
        } else {
            System.out.println("PART B: !!!!!!!TEST 2 FAILED!!!!!!!");
        }
        contains = personA.isUsed("robert", usedA);
        if (!contains) {
            System.out.println("PART B: TEST 3 PASSED");
        } else {
            System.out.println("PART B: !!!!!!!TEST 3 FAILED!!!!!!!");
        }
        System.out.println("--------------------------------");
        String[] used = {"harta", "hartm", "harty"};
        UserName person3 = new UserName("mary", "hart");
        person3.setAvailableUserNames(used);
        ArrayList<String> names3 = person3.getPossibleNames();
        if (names3.size() == 3 && names3.contains("hartma") && names3.contains("hartmar")
                && names3.contains("hartmary")) {
            System.out.println("PART C: TEST 1 PASSED");
        } else {
            System.out.println("PART C: !!!!!!!TEST 1 FAILED!!!!!!!");
        }
        String[] used2 = {"technicolorj", "technicolor", "technicolorjoseph", "techni"};
        UserName person4 = new UserName("joseph", "technicolor");
        person4.setAvailableUserNames(used2);
        ArrayList<String> names4 = person4.getPossibleNames();
        if (names4.size() == 4 && names4.contains("technicolorjo") && names4.contains("technicolorjos")
                && names4.contains("technicolorjose") && names4.contains("technicolorjosep")) {
            System.out.println("PART C: TEST 2 PASSED");
        } else {
            System.out.println("PART C: !!!!!!!TEST 2 FAILED!!!!!!!");
        }

    }
}
