public class CodeWordRunner
{
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(3, 6, "e");
        StringChecker sc2 = new CodeWordChecker("p");

        System.out.println(sc1.isValid("hello"));
        System.out.println(sc1.isValid("my"));
        System.out.println(sc1.isValid("name"));
        System.out.println(sc1.isValid("is"));

        System.out.println(sc2.isValid("scientific"));
        System.out.println(sc2.isValid("railgun"));
        System.out.println(sc2.isValid("magical"));
        System.out.println(sc2.isValid("index"));
    }
}