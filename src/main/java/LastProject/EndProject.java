package LastProject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EndProject {
    public static void main(String[] args) {

        Cats v1 = new Cats();
        v1.id = 100123;
        v1.age = 10;
        v1.breed = "siam";
        v1.gender = "female";
        v1.nickname = "Sonia";
        v1.nameOwner = "Belova";

        Cats v2 = new Cats();
        v2.id = 100124;
        v2.age = 9;
        v2.breed = "Siberian";
        v2.gender = "male";
        v2.nickname = "Rokky";
        v2.nameOwner = "Sidorov";

        Cats v3 = new Cats();
        v3.id = 100125;
        v3.age = 4;
        v3.breed = "none";
        v3.gender = "female";
        v3.nickname = "Pushinka";
        v3.nameOwner = "Ivanova";

        Cats v4 = new Cats();
        v4.id = 100124;
        v4.age = 9;
        v4.breed = "Siberian";
        v4.gender = "male";
        v4.nickname = "Rokky";
        v4.nameOwner = "Sidorov";


        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4);

        System.out.println(!(v2 != v4));
        System.out.println(v2.equals(v4));
        var cats = new HashSet<Cats>(Arrays.asList(v1, v2, v3));
        System.out.println(cats.contains(v4));
    }
}
